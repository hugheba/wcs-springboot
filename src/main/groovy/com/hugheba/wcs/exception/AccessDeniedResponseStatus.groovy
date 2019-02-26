package com.hugheba.wcs.exception

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

@ResponseStatus(HttpStatus.FORBIDDEN)
final class AccessDeniedResponseStatus extends RuntimeException {
    AccessDeniedResponseStatus() { super() }
}
