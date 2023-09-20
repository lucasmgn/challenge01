package br.com.compass.challenge.challenge.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

import java.io.Serial;

@Getter
public class CarNotFoundException extends RuntimeException{

    @Serial
    private static final long serialVersionUID = 1L;

    private final ErrorCode errorCode;

    private final HttpStatus status;

    public CarNotFoundException() {
        super(ErrorCode.NOT_FOUND.name());
        this.status = HttpStatus.NOT_FOUND;
        this.errorCode = ErrorCode.NOT_FOUND;
    }
}
