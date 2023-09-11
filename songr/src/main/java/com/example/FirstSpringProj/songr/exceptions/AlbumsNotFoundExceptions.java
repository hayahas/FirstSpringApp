package com.example.FirstSpringProj.songr.exceptions;

public class AlbumsNotFoundExceptions extends RuntimeException{

    public AlbumsNotFoundExceptions(String message){
        super(message);
    }
    public AlbumsNotFoundExceptions(Throwable cause){
        super(cause);
    }

}
