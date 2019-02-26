package com.hugheba.wcs.springboot.service

import com.hugheba.wcs.model.hook.*
import groovy.transform.CompileStatic
import groovy.util.logging.Slf4j

@Slf4j
@CompileStatic
class WcsHookService {

    void availableStream(AvailableStreamRequest req)  { }

    void bugReportStatusEvent(BugReportStatusEventRequest req) { }

    void callStatusEvent(CallStatusEventRequest req) { }

    void connect(ConnectRequest req) { }

    void connectionStatusEvent(ConnectionStatusEventRequest req) { }

    void dataStatusEvent(DataStatusEventRequest req) { }

    void errorStatusEvent(ErrorStatusEventRequest req) { }

    void hangup(HangupRequest req) { }

    void hold(HoldRequest req) { }

    void messageStatusEvent(MessageStatusEventRequest req) { }

    void onCallEvent(OnCallEventRequest req) { }

    void onDataEvent(OnDataEventRequest req) { }

    void onMessageEvent(OnMessageEventRequest req) { }

    void onTransferEvent(OnTransferEventRequest req) { }

    void pauseStream(PauseStreamRequest req) { }

    void playHLS(PlayHLSRequest req) { }

    void playRTSP(PlayRTSPRequest req) { }

    void playStream(PlayStreamRequest req) { }

    void publishStream(PublishStreamRequest req) { }

    void recordingStatusEvent(RecordingStatusEventRequest req) { }

    void registrationStatusEvent(RegistrationStatusEventRequest req) { }

    void sendDtmf(SendDtmfRequest req) { }

    void sendMessage(SendMessageRequest req) { }

    void sessionDebug(SessionDebugRequest req) { }

    void sessionDebugStatusEvent(SessionDebugStatusEventRequest req) { }

    void streamsStatEvent(StreamsStatEventRequest req) { }

    void streamStatusEvent(StreamStatusEventRequest req) { }

    void streamTranscodingGroupEvent(StreamTranscodingGroupEventRequest req) { }

    void subscribe(SubscribeRequest req) { }

    void xcapStatusEvent(XcapStatusEventRequest req) { }

}
