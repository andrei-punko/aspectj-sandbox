# Different cases of Aspects usage

![Maven Build](https://github.com/andrei-punko/aspectj-sandbox/workflows/Java%20CI%20with%20Maven/badge.svg)
[![Coverage](.github/badges/jacoco.svg)](https://github.com/andrei-punko/aspectj-sandbox/actions/workflows/maven.yml)
[![Branches](.github/badges/branches.svg)](https://github.com/andrei-punko/aspectj-sandbox/actions/workflows/maven.yml)

Based on [this article](https://www.baeldung.com/aspectj)

## Prerequisites

- JDK 21
- Maven 3

## Types of aspects covered

- [Compile-time weaving](compile-time-weaving)
- [Post-compile-time weaving](post-compile-time-weaving)
  with [sources](stub-sources-for-post-compile-weaving) for it
- [Load-time weaving](load-time-weaving)

## How to build

```shell
mvn clean install
```
