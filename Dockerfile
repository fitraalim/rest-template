FROM amazoncorretto:11-alpine
COPY startup.sh startup.sh
RUN chmod +x startup.sh
COPY ./target/rest-template-0.0.1.jar /usr/app/
EXPOSE 8080
ENTRYPOINT ["/bin/sh", "startup.sh"]
