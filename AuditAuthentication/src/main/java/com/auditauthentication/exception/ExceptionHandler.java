package com.auditauthentication.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

public class ExceptionHandler extends ResponseEntityExceptionHandler {

	@org.springframework.web.bind.annotation.ExceptionHandler({AccessDeniedException.class})
    public final ResponseEntity<String> handleAccessDeniedException(AccessDeniedException ex, WebRequest request) {
        return new ResponseEntity<String>("Access Is Denied ",HttpStatus.FORBIDDEN);
    }
	
}
