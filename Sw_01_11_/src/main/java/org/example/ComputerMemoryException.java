package org.example;

public class ComputerMemoryException extends Exception{

    public ComputerMemoryException(String errorMessage) {
        super(errorMessage);
    }

    public String toString(){
        return "ComputerMemoryException keletkezett: " + this.getMessage();
    }



}
