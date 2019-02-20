# wcs-springboot

[![](https://jitpack.io/v/hugheba/wcs-springboot.svg)](https://jitpack.io/#hugheba/wcs-springboot)

Library to speed up integration of Flashphoner WebCallServer into SpringBoot apps.

The project contains:

- A WebCallServer API Java client library 
- An API server to respond to web-hooks from a WebCallServer

## TODO

- Create springboot-starter to autoconfigure application
- Allow for customization of model properties

# Installation

Add the dependency to a SpringBoot application.

## Gradle

In your `build.gradle` add:

```groovy
repositories {
    maven { url 'https://jitpack.io' }
}

dependencies {
    implementation 'com.github.hugheba.wcs-springboot:wcs:${release}'
}
```

## Maven

In your `pom.xml` add:

```xml
<repository>
    <id>jitpack.io</id>
    <url>https://jitpack.io</url>
</repository>

<dependency>
    <groupId>com.github.hugheba.wcs-springboot</groupId>
    <artifactId>wcs</artifactId>
    <version>${release}</version>
</dependency>
```

## SpringBoot

Add the dependencies to your SpringBoot application's component scan:

```java
@SpringBootApplication(scanBasePackages={"com.hugheba.wcs.springboot"})
public class SpringBootApplication() {}
```

# WebCallServer Client Library

## Configuration

Configure these `application.properties` in the project:

- `wcs.api.uri`: This is a the URI to the WebCallServer (i.e. http://127.0.0.1:8081)

## Usage

You can use the `com.hugheba.wcs.springboot.service.WcsApiClientService` service bean to access the WebCallServer 
configured with the `wcs.api.uri` property.

Refer to the WebCallServer API documentation: https://flashphoner.com/docs/wcs5/265/html/en/wcs-rest-api/

# WebCallService Hook Server

## Configuration

### application.properties

Configure these `application.properties` in the project:

- `wcs.hook.uri.path-prefix`: The URI prefix for custom hook endoints (i.e. `/api/v1`) 

### Usage

Hook logic can be customized by overriding a Service bean that contain the hook logic.

Create a SpringBoot Service class named `wcsHookService` that extends `com.hugheba.wcs.springboot.service.WcsHookService` 
and overrides any of the hooks; **connect**, **publishStream**, **StreamStatusEvent**, or **OnCallEvent** method.

The parent `WcsHookService` has defaults to return _true_ for all methods so you only need to override
those methods you need to customize.

```java
import com.hugheba.wcs.model.hook.*;
import com.hugheba.wcs.springboot.service.WcsHookService;

@Service('wcsHookService')
public class MyCustomWcsHookService extends WcsHookService {
    
    @Override
    public static void connect(ConnectRequest req) ...
    
    @Override
    public static void publishStream(PublishStreamRequest req) ...
    
    @Override
    public static void streamStatusEvent(StreamStatusEventRequest req) ... 
      
    @Override
    public static void onCallevent(OnCallEventRequest req) ...
    
}
```
