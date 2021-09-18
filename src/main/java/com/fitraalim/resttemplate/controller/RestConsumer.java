package com.fitraalim.resttemplate.controller;

import com.fitraalim.resttemplate.domain.Comment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

@Configuration
@ComponentScan(basePackages = {"com.fitraalim.*"})
@PropertySource("classpath:application.properties")

@RestController
public class RestConsumer {
    RestTemplate restTemplate;

    public RestConsumer(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Value("${jsonplaceholder.url}")
    private String jsonplaceholderUrl;

    @RequestMapping(value = "/comments")
    public Comment[] getCommentList() {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<>(httpHeaders);
        return restTemplate.exchange(jsonplaceholderUrl, HttpMethod.GET, entity, Comment[].class).getBody();
    }

    @RequestMapping(value = "/comments/{id}")
    public String getCommentListID(@PathVariable("id") long id) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<>(httpHeaders);
        return restTemplate.exchange(jsonplaceholderUrl + id, HttpMethod.GET, entity, String.class).getBody();
    }

}
