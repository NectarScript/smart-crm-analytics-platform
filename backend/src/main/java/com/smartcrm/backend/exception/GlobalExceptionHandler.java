package com.smartcrm.backend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorResponse handleValidationExceptions(
            MethodArgumentNotValidException ex) {

        List<String> errors = ex.getBindingResult()
                .getFieldErrors()
                .stream()
                .map(error ->
                        error.getField() + " " + error.getDefaultMessage())
                .collect(Collectors.toList());

        return new ErrorResponse("Validation failed", errors);
    }

    static class ErrorResponse {
        public String error;
        public List<String> details;

        public ErrorResponse(String error, List<String> details) {
            this.error = error;
            this.details = details;
        }
    }
}
