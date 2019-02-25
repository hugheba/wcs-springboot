package com.hugheba.wcs.model.hook

class ConnectionStatusEventRequest {
    String appKey
    String authToken
    String clientBrowserVersion
    String clientOsVersion
    String clientVersion
    Map<String, Object> custom
    Boolean keepAlive
    List<String> mediaProviders
    String nodeId
    String origin
    String sessionId
    String status
    Boolean useBase64BinaryEncoding
    Boolean useWsTunnel
    Boolean useWsTunnelPacketization2
}
