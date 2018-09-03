package com.phimes.sic.api.exception;

public class DataSourceNotFoundException extends Exception {
   
    public DataSourceNotFoundException (Throwable cause) {
        super (cause);
    }

    public DataSourceNotFoundException(String message, Throwable cause) {
        super (message, cause);
    }

    public DataSourceNotFoundException (String message) {
        super (message);
    }

    public DataSourceNotFoundException() {

    }
}
