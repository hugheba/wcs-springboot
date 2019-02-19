package com.hugheba.wcs.model

import com.fasterxml.jackson.annotation.JsonProperty

class CDNStreamRoute {
    @JsonProperty('REQUESTED-PROFILE') String REQUESTED_PROFILE
    String PROFILE
    String STREAM
    String PROXY
    @JsonProperty('PROXY-PROFILE') String PROXY_PROFILE
}
