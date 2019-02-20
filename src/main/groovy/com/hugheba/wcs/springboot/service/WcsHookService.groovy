package com.hugheba.wcs.springboot.service

import com.hugheba.wcs.model.hook.ConnectRequest
import com.hugheba.wcs.model.hook.OnCallEventRequest
import com.hugheba.wcs.model.hook.PublishStreamRequest
import com.hugheba.wcs.model.hook.StreamStatusEventRequest
import groovy.transform.CompileStatic
import groovy.util.logging.Slf4j
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

@Slf4j
@CompileStatic
class WcsHookService {

    @ResponseStatus(HttpStatus.FORBIDDEN)
    final class AccessDeniedResponseStatus extends RuntimeException {}

    void connect(ConnectRequest req) { true }

    void publishStream(PublishStreamRequest req) { true }

    void streamStatusEvent(StreamStatusEventRequest req) { true }

    void onCallEvent(OnCallEventRequest req) { true }

}
