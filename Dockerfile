FROM maven:3-jdk-8-alpine as builder

WORKDIR /usr/local/

ENTRYPOINT ["mvn", "install"]
