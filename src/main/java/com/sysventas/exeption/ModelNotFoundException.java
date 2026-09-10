package com.sysventas.exeption;

public class ModelNotFoundException extends RuntimeException {
    public ModelNotFoundException(String message){
        super(message);
    }
}
