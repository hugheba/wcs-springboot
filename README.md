#wcs-springboot

Library to speed up integration of Flashphoner WebCallServer into SpringBoot apps.

The project contains:

- A WebCallServer API Java client library 
- An API server to respond to web-hooks from a WebCallServer

#Installation

Add the dependency to a SpringBoot application.

## Gradle

    sourceControl {
        ...
        gitRepository("https://github.com/hugheba/wcs-springboot.git") {
            producesModule("com.hugheba.wcs:wcs-springboot")
        }
        ...
    }
    
    dependencies {
        ...
        implementation 'com.hugheba.wcs:wcs-springboot:1.0'
        ...
    }

## Maven

    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
    
    <dependency>
        <groupId>com.github.hugheba</groupId>
        <artifactId>wcs-springboot</artifactId>
        <version>master</version>
    </dependency>

## SpringBoot

Add this dependency to your applcations @ComponentScan("com.hugheba.wcs.springboot") 

# WebCallServer Client Library

## Configuration

Configure these `application.properties` in the project:

- `wcs.api.uri`: This is a the URI to the WebCallServer (i.e. http://127.0.0.1:8081)

## Usage



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

    import com.hugheba.wcs.model.hook.*
    import com.hugheba.wcs.springboot.service.WcsHookService
    
    @Service('wcsHookService')
    class MyCustomWcsHookService extends WcsHookService {
        @Override
        public static void connect(ConnectRequest req) ...
        
        @Override
        public static void publishStream(PublishStreamRequest req) ...
        
        @Override
        public static void streamStatusEvent(StreamStatusEventRequest req) ..
        
        @Override
        public static void onCallevent(OnCallEventRequest req) ...
    }
