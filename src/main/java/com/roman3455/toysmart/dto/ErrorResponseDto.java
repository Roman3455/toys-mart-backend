package com.roman3455.toysmart.dto;

import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
import java.util.Objects;

public class ErrorResponseDto {

    private String apiPath;
    private HttpStatus errorCode;
    private String errorMessage;
    private LocalDateTime errorTimestamp;

    public ErrorResponseDto(
            String apiPath,
            HttpStatus errorCode,
            String errorMessage,
            LocalDateTime errorTimestamp
    ) {
        this.apiPath = apiPath;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.errorTimestamp = errorTimestamp;
    }

    public String getApiPath() {
        return apiPath;
    }

    public void setApiPath(String apiPath) {
        this.apiPath = apiPath;
    }

    public HttpStatus getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(HttpStatus errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public LocalDateTime getErrorTimestamp() {
        return errorTimestamp;
    }

    public void setErrorTimestamp(LocalDateTime errorTimestamp) {
        this.errorTimestamp = errorTimestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ErrorResponseDto that = (ErrorResponseDto) o;
        return Objects.equals(apiPath, that.apiPath) && errorCode == that.errorCode && Objects.equals(errorMessage, that.errorMessage) && Objects.equals(errorTimestamp, that.errorTimestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apiPath, errorCode, errorMessage, errorTimestamp);
    }

    @Override
    public String toString() {
        return "ErrorResponseDto{" +
                "apiPath='" + apiPath + '\'' +
                ", errorCode=" + errorCode +
                ", errorMessage='" + errorMessage + '\'' +
                ", errorTimestamp=" + errorTimestamp +
                '}';
    }

}
