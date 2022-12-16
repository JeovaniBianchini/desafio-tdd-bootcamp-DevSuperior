package com.devsuperior.bds02.services.exceptions;

public class EntityNotFoundException extends RuntimeException{

    public EntityNotFoundException(String msg){
        super(msg);
    }
}
