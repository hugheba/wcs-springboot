package com.hugheba.wcs.springboot.controller

import com.hugheba.wcs.model.hook.*
import com.hugheba.wcs.springboot.service.WcsHookService
import groovy.transform.CompileStatic
import groovy.util.logging.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import sun.misc.Request

@Slf4j
@CompileStatic
@RestController
@RequestMapping('${wcs.hook.uri.path-prefix}')
class WcsHookController {

    @Autowired WcsHookService wcsHookService

    @PostMapping(value='/availableStream')
    AvailableStreamRequest availableStream(@RequestBody AvailableStreamRequest req) {
        wcsHookService.availableStream(req)
        req
    }

    @PostMapping(value='/BugReportStatusEvent')
    BugReportStatusEventRequest bugReportStatusEvent(@RequestBody BugReportStatusEventRequest req) {
        wcsHookService.bugReportStatusEvent(req)
        req
    }

    @PostMapping(value='/CallStatusEvent')
    CallStatusEventRequest callStatusEvent(@RequestBody CallStatusEventRequest req) {
        wcsHookService.callStatusEvent(req)
        req
    }

    @PostMapping(value='/connect')
    ConnectRequest connect(@RequestBody ConnectRequest req) {
        wcsHookService.connect(req)
        req
    }

    @PostMapping(value='/ConnectionStatusEvent')
    ConnectionStatusEventRequest connectionStatusEvent(@RequestBody ConnectionStatusEventRequest req) {
        wcsHookService.connectionStatusEvent(req)
        req
    }

    @PostMapping(value='/DataStatusEvent')
    DataStatusEventRequest dataStatusEvent(@RequestBody DataStatusEventRequest req) {
        wcsHookService.dataStatusEvent(req)
        req
    }

    @PostMapping(value='/ErrorStatusEvent')
    ErrorStatusEventRequest errorStatusEvent(@RequestBody ErrorStatusEventRequest req) {
        wcsHookService.errorStatusEvent(req)
        req
    }

    @PostMapping(value='/hangup')
    HangupRequest hangup(@RequestBody HangupRequest req) {
        wcsHookService.hangup(req)
        req
    }

    @PostMapping(value='/hold')
    HoldRequest hold(@RequestBody HoldRequest req) {
        wcsHookService.hold(req)
        req
    }

    @PostMapping(value='/MessageStatusEvent')
    MessageStatusEventRequest messageStatusEvent(@RequestBody MessageStatusEventRequest req) {
        wcsHookService.messageStatusEvent(req)
        req
    }

    @PostMapping(value='/OnCallEvent')
    OnCallEventRequest onCallEvent(@RequestBody OnCallEventRequest req) {
        wcsHookService.onCallEvent(req)
        req
    }

    @PostMapping(value='/OnDataEvent')
    OnDataEventRequest onDataEvent(@RequestBody OnDataEventRequest req) {
        wcsHookService.onDataEvent(req)
        req
    }

    @PostMapping(value='/OnMessageEvent')
    OnMessageEventRequest onMessageEvent(@RequestBody OnMessageEventRequest req) {
        wcsHookService.onMessageEvent(req)
        req
    }

    @PostMapping(value='/OnTransferEvent')
    OnTransferEventRequest OnTransferEvent(@RequestBody OnTransferEventRequest req) {
        wcsHookService.onTransferEvent(req)
        req
    }

    @PostMapping(value='/pauseStream')
    PauseStreamRequest pauseStream(@RequestBody PauseStreamRequest req) {
        wcsHookService.pauseStream(req)
        req
    }

    @PostMapping(value='/playHLS')
    PlayHLSRequest playHLS(@RequestBody PlayHLSRequest req) {
        wcsHookService.playHLS(req)
        req
    }

    @PostMapping(value='/playRTSP')
    PlayRTSPRequest playRTSP(@RequestBody PlayRTSPRequest req) {
        wcsHookService.playRTSP(req)
        req
    }

    @PostMapping(value='/playStream')
    PlayStreamRequest playStream(@RequestBody PlayStreamRequest req) {
        wcsHookService.playStream(req)
        req
    }

    @PostMapping(value='/publishStream')
    PublishStreamRequest publishStream(@RequestBody PublishStreamRequest req) {
        wcsHookService.publishStream(req)
        req
    }

    @PostMapping(value='/RegistrationStatusEvent')
    RegistrationStatusEventRequest registrationStatusEvent(@RequestBody RegistrationStatusEventRequest req) {
        wcsHookService.registrationStatusEvent(req)
        req
    }

    @PostMapping(value='/RecordingStatusEvent')
    RecordingStatusEventRequest RecordingStatusEvent(@RequestBody RecordingStatusEventRequest req) {
        wcsHookService.recordingStatusEvent(req)
        req
    }

    @PostMapping(value='/sendDtmf')
    SendDtmfRequest sendDtmf(@RequestBody SendDtmfRequest req) {
        wcsHookService.sendDtmf(req)
        req
    }

    @PostMapping(value='/sendMessage')
    SendMessageRequest sendMessage(@RequestBody SendMessageRequest req) {
        wcsHookService.sendMessage(req)
        req
    }

    @PostMapping(value='/sessionDebug')
    SessionDebugRequest sessionDebug(@RequestBody SessionDebugRequest req) {
        wcsHookService.sessionDebug(req)
        req
    }

    @PostMapping(value='/SessionDebugStatusEvent')
    SessionDebugStatusEventRequest SessionDebugStatusEvent(@RequestBody SessionDebugStatusEventRequest req) {
        wcsHookService.sessionDebugStatusEvent(req)
        req
    }

    @PostMapping(value='/StreamStatusEvent')
    StreamStatusEventRequest streamStatusEvent(@RequestBody StreamStatusEventRequest req) {
        wcsHookService.streamStatusEvent(req)
        req
    }

    @PostMapping(value='/StreamsStatEvent')
    StreamsStatEventRequest streamsStatEvent(@RequestBody StreamsStatEventRequest req) {
        wcsHookService.streamsStatEvent(req)
        req
    }

    @PostMapping(value='/StreamTranscodingGroupEvent')
    StreamTranscodingGroupEventRequest streamTranscodingGroupEvent(@RequestBody StreamTranscodingGroupEventRequest req) {
        wcsHookService.streamTranscodingGroupEvent(req)
        req
    }

    @PostMapping(value='/subscribe')
    SubscribeRequest subscribe(@RequestBody SubscribeRequest req) {
        wcsHookService.subscribe(req)
        req
    }

    @PostMapping(value='/XcapStatusEvent')
    XcapStatusEventRequest xcapStatusEvent(@RequestBody XcapStatusEventRequest req) {
        wcsHookService.xcapStatusEvent(req)
        req
    }

/*

    sendXcapRequest
    unPublishStream
    call
    transfer
    answer
    stopStream
    StreamKeepAliveEvent
    SubscriptionStatusEvent
    unhold
    TransferStatusEvent
    snapshot
    pushLogs
    submitBugReport
*/
}
