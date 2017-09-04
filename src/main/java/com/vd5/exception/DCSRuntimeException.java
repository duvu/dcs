package com.vd5.exception;

/**
 * @author beou on 8/27/17 04:30
 * @version 1.0
 */
public class DCSRuntimeException extends RuntimeException {

    public DCSRuntimeException(Exception ex) {
        super(ex);
    }

    public DCSRuntimeException(ClassNotFoundException cnfe) {
        super(cnfe);
    }
}
