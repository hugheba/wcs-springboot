package com.hugheba.wcs.model.hook

class StreamStatusEventRequest {
    String nodeId
    String appKey
    String sessionId
    String mediaSessionId
    String name
    Boolean published
    Boolean hasVideo
    Boolean hasAudio
    String status
    String sdp
    Boolean record
    Integer width
    Integer height
    Integer bitrate
    Integer quality
    String mediaProvider
}
