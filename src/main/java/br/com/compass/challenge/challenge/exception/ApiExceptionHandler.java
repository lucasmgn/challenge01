package br.com.compass.challenge.challenge.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler(CarNotFoundException.class)
    public final ResponseEntity<Object> handlerCarNotFound(CarNotFoundException exception){
        var problem = new Problem(exception.getErrorCode(), exception);
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(problem);
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public final ResponseEntity<Object> handlerBrandNotFound() {
        var brandNotFoundException = new BrandNotFoundException();
        var problem = new Problem(brandNotFoundException.getErrorCode(), brandNotFoundException);
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(problem);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public final ResponseEntity<Object> handlerMethodArgumentNotValidException() {
        var problem = new Problem(ErrorCode.BAD_REQUEST, HttpStatus.BAD_REQUEST);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(problem);
    }

    @ExceptionHandler(Exception.class)
    public final ResponseEntity<Object> handlerAllExceptions(){
        var problem = new Problem(ErrorCode.SYSTEM_ERROR);
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(problem);
    }
}
