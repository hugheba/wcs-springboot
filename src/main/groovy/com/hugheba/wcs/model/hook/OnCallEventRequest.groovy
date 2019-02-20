package com.hugheba.wcs.model.hook

class OnCallEventRequest {
    String nodeId
    String appKey
    String sessionId
    String callId
    Boolean incoming
    String status
    String caller
    String callee
    Boolean hasAudio
    Boolean hasVideo
    String mediaProvider
    Boolean isMsrp
    Boolean holdForTransfer
    Map<String, Object> custom
}
