package com.apimicroservicios;

public class MovieSearchException extends RuntimeException {
    public MovieSearchException(String message) {
        super(message);
    }
}