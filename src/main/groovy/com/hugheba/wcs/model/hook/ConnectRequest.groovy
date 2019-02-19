package com.hugheba.wcs.model.hook

class ConnectRequest {
    String nodeId
    String appKey
    String sessionId
    Boolean useWsTunnel
    Boolean useWsTunnelPacketization2
    Boolean useBase64BinaryEncoding
    List<String> mediaProviders
    String clientVersion
    String clientOSVersion
    String clientBrowserVersion
}
