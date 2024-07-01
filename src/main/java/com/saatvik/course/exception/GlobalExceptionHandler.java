package com.saatvik.course.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(CourseNotFoundException.class)
    public ResponseEntity<CustomErrorHandler> handleCourseNotFoundException(CourseNotFoundException ex){
        CustomErrorHandler errorHandler = new CustomErrorHandler(404, ex.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorHandler);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<CustomErrorHandler> handleGenericException(Exception ex){
        CustomErrorHandler errorHandler = new CustomErrorHandler(500, ex.getMessage());
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorHandler);
    }
}
