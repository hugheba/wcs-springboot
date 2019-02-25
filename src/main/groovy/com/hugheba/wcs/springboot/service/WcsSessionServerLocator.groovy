package com.hugheba.wcs.springboot.service

import com.hugheba.wcs.model.SessionServer

interface WcsSessionServerLocator {
    void setSessionServer(SessionServer sessionServer)
    SessionServer getSessionServer(String session)
    void removeSessionServer(String session)
}