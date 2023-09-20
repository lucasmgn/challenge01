package br.com.compass.challenge.challenge.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {

    NOT_FOUND("Data Not Found"),

    BAD_REQUEST("Invalid Data"),

    SYSTEM_ERROR("Unavailable Server");

    private final String message;
}
