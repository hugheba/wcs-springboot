package com.hugheba.wcs.springboot.controller

import com.hugheba.wcs.model.hook.ConnectRequest
import com.hugheba.wcs.model.hook.OnCallEventRequest
import com.hugheba.wcs.model.hook.PublishStreamRequest
import com.hugheba.wcs.model.hook.StreamStatusEventRequest
import com.hugheba.wcs.springboot.service.WcsHookService
import groovy.transform.CompileStatic
import groovy.util.logging.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Slf4j
@CompileStatic
@RestController
@RequestMapping('${wcs.hook.uri.path-prefix}')
class WcsHookController {

    @Autowired WcsHookService wcsHookService

    @PostMapping(value='/connect')
    ConnectRequest connect(@RequestBody ConnectRequest req) {
        wcsHookService.connect(req)
        req
    }

    @PostMapping(value='/publishStream')
    PublishStreamRequest publishStream(@RequestBody PublishStreamRequest req) {
        wcsHookService.publishStream(req)
        req
    }

    @PostMapping(value='/StreamStatusEvent')
    StreamStatusEventRequest streamStatusEvent(@RequestBody StreamStatusEventRequest req) {
        wcsHookService.streamStatusEvent(req)
        req
    }

    @PostMapping(value='/OnCallEvent')
    OnCallEventRequest onCallEvent(@RequestBody OnCallEventRequest req) {
        wcsHookService.onCallEvent(req)
        req
    }
}
