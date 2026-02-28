package org.raoamigos.springboot1;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApplicationException {

    @ExceptionHandler(EmployeeNotFoundException.class)
    public String handleException(EmployeeNotFoundException ex){
        return ex.getMessage();
    }

    @ExceptionHandler(Exception.class)
    public String handleException(Exception ex){
        return "Exception";
    }
}
