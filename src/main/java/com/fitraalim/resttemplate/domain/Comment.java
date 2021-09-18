package com.fitraalim.resttemplate.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Comment {

    @JsonProperty("postId")
    int postId;

    @JsonProperty("id")
    int id;

    @JsonProperty("name")
    String name;

    @JsonProperty("email")
    String email;

    @JsonProperty("body")
    String body;

}
