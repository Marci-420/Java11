package org.example;

public class UtasNumberException extends Exception{

    public UtasNumberException(String errorMessage) {
        super(errorMessage);
    }

    public String toString(){
        return "UtasNumberException keletkezett: " + this.getMessage();
    }

}

