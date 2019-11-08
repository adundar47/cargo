package com.kgteknoloji.cargo.controller;

import com.kgteknoloji.cargo.exception.AlreadyExistException;
import com.kgteknoloji.cargo.exception.BadRequestException;
import com.kgteknoloji.cargo.exception.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import tr.com.yurticikargo.shippingorderdispatcherservices.YurticikargoWSException;

@ControllerAdvice(annotations = RestController.class)
public class GlobalExceptionHandler {

    @ExceptionHandler(NotFoundException.class)
    @ResponseBody
    public ResponseEntity<?> handleNotFoundException(NotFoundException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);

    }

    @ExceptionHandler(AlreadyExistException.class)
    @ResponseBody
    public ResponseEntity<?> handleAlreadyExistException(AlreadyExistException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.CONFLICT);

    }

    @ExceptionHandler(BadRequestException.class)
    @ResponseBody
    public ResponseEntity<?> handleBadRequestException(BadRequestException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
    }


    @ExceptionHandler(YurticikargoWSException.class)
    @ResponseBody
    public ResponseEntity<?> handleYurticikargoWSException(YurticikargoWSException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);

    }

}
