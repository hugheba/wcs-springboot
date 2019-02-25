package com.hugheba.wcs.model

class SessionServer {
    String sessionId
    String nodeId

    String getHostFromNodeId() {
        nodeId.split('@')[-1]
    }
}
