package com.hugheba.wcs.springboot.service

import com.hugheba.wcs.model.Connection
import com.hugheba.wcs.model.Stream
import groovy.transform.CompileStatic
import groovy.util.logging.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.stereotype.Service
import org.springframework.util.MultiValueMap
import org.springframework.web.client.RestTemplate
import org.springframework.web.util.UriComponentsBuilder

/**
 * Java Util to make REST calls to WebCallServer API
 *
 * Configure WebCallServer base URI with the wcs.api.uri.prefix property
 *
 * @url https://docs.flashphoner.com/display/WCS52EN/API+methods
 */
@Slf4j
@CompileStatic
@Service('wcsApiClientService')
@Configuration
class WcsApiClientService {

    @Bean('wcsRestTemplate')
    RestTemplate wcsRestTemplate() {
        return new RestTemplate()
    }

    @Autowired RestTemplate wcsRestTemplate

    @Value('wcs.api.uri.prefix') String uri

    URI generateUri(String path, Map reqParams = null) {
        UriComponentsBuilder
                .fromUriString(uri)
                .path(path)
                .queryParams((reqParams?: [:]) as MultiValueMap<String, String>)
                .build()
                .encode()
                .toUri()
    }

    /* BEGIN STREAMING */

    List<Stream> streamFindAll() {
        wcsRestTemplate.postForObject(
                generateUri('/stream/find_all')
                , [:]
                , List<Stream>
        )
    }

    List<Stream> streamFind(String name, String mediaSessionId, String status, String published) {
        wcsRestTemplate.postForObject(
                generateUri('/stream/find')
                , [name: name, mediaSessionId: mediaSessionId, status: status, published: published]
                ,List<Stream>
        )
    }

    Void streamTerminate(String name, List<String> mediaSessionIds, String status, Boolean published) {
        wcsRestTemplate.postForObject(
                generateUri('/terminate')
                , [name: name, ]
                , Void
        )
    }

    Base64 streamSnapshot(String streamName) {
        wcsRestTemplate.postForObject(
                generateUri('/stream/snapshot')
                , [streamName: streamName]
                , Base64
        )
    }

    Void streamStartRecording(String mediaSessionId) {
        wcsRestTemplate.postForObject(
                generateUri('/stream/startRecording')
                , [mediaSessionId: mediaSessionId]
                , Void
        )
    }

    Void streamStopRecording(String mediaSessionId) {
        wcsRestTemplate.postForObject(
                generateUri('/stream/stopRecording')
                , [mediaSessionId: mediaSessionId]
                , Void
        )
    }

    /* END STREAMING */


    /* BEGIN DATA */

    Void dataSend(String nodeId, String sessionId, String operationId, Object payload) {
        wcsRestTemplate.postForObject(
                generateUri('/data/send')
                , [nodeId: nodeId, sessionId: sessionId, operationId: operationId, payload: payload]
                , Void
        )
    }

    /* BEGIN DATA */


    /* BEGIN CONNECTION */

    Void connectionTerminate(String sessionId) {
        wcsRestTemplate.postForObject(
                generateUri('/connection/terminate')
                , [:]
                , Void
        )
    }

    List<Connection> connectionFindAll() {
        wcsRestTemplate.postForObject(
                generateUri('/connection/find_all')
                , [:]
                , List<Connection>
        )
    }

    List<Connection> connectionFind(String appKey, String sessionId, String clientVersion) {
        wcsRestTemplate.postForObject(
                generateUri('/connection/find')
                , [appKey: appKey, sessionId: sessionId, clientVersion: clientVersion]
                , List<Connection>
        )
    }

    /* END CONNECTION */


}
