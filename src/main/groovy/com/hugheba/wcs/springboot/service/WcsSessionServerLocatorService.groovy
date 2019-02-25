package com.hugheba.wcs.springboot.service

import com.hugheba.wcs.model.SessionServer
import groovy.transform.CompileStatic
import groovy.util.logging.Slf4j
import org.springframework.stereotype.Service

@Slf4j
@CompileStatic
@Service('wcsSessionServerLocatorService')
class WcsSessionServerLocatorService implements WcsSessionServerLocator {

    final Map<String, SessionServer> sessionServerRepository = new HashMap<String, SessionServer>()

    @Override
    void setSessionServer(SessionServer sessionServer) {
        sessionServerRepository.put(sessionServer.sessionId, sessionServer)
    }

    @Override
    SessionServer getSessionServer(String session) {
        sessionServerRepository.get(session)
    }

    @Override
    void removeSessionServer(String session) {
        sessionServerRepository.remove(session)
    }
}
