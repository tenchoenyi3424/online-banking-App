package com.byteseazy.account.exception;


import com.byteseazy.account.dto.ErrorResponeDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(CustomerAlreadyExitsException.class)
    public ResponseEntity<ErrorResponeDto> handleCustomerAlreadyExitsException(CustomerAlreadyExitsException exception,
                                    WebRequest webRequest){
        ErrorResponeDto errorResponeDto = new ErrorResponeDto(
            webRequest.getDescription(false),
                HttpStatus.BAD_REQUEST,
                exception.getMessage(),
                LocalDateTime.now());


        return new ResponseEntity<>(errorResponeDto, HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ErrorResponeDto> handleResourceNotFoundException(ResourceNotFoundException exception,
                                                                               WebRequest webRequest){
        ErrorResponeDto errorResponeDto = new ErrorResponeDto(
                webRequest.getDescription(false),
                HttpStatus.NOT_FOUND,
                exception.getMessage(),
                LocalDateTime.now());


        return new ResponseEntity<>(errorResponeDto, HttpStatus.NOT_FOUND);
    }

}

