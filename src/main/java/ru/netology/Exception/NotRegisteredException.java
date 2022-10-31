package ru.netology.Exception;

public class NotRegisteredException extends RuntimeException{
    public NotRegisteredException(String q){
        super(q);
    }
}
