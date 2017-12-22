package com.example.eurekauser.controller;

import Model.APIResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public APIResponse exceptionHandler(HttpServletRequest request, Exception ex){
        return new APIResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(), ex.getMessage(), null);
    }

}
