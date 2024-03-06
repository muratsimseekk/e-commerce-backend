package com.ecommercebackend.javaspring.exceptions;


import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

@Slf4j
@ControllerAdvice
public class GlobalErrorHandler {

    public ResponseEntity<CategoryErrorResponse> handleException(CategoryException categoryException){
        log.error("CategoryException occured ! Exception details : " + categoryException.getMessage());

        CategoryErrorResponse errorResponse = new CategoryErrorResponse(categoryException.getHttpStatus().value(), categoryException.getMessage(), System.currentTimeMillis());

        return new ResponseEntity<>(errorResponse , categoryException.getHttpStatus());
    }

    public ResponseEntity<CategoryErrorResponse> handleException(Exception exception){
        log.error("General Exception occured ! Exception details : " + exception.getMessage());

        CategoryErrorResponse categoryErrorResponse = new CategoryErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(), exception.getMessage(), System.currentTimeMillis());

        return new ResponseEntity<>(categoryErrorResponse,HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
