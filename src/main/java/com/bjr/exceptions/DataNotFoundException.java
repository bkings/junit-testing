package com.bjr.exceptions;

/**
 * @author bkings
 * @version 1.0.0
 * @since 2022-05-02 21:26
 */

public class DataNotFoundException extends RuntimeException {
    public DataNotFoundException(String message) {
        super(message);
    }
}
