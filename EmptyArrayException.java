package ru.itis.ing304.dz2;

public class EmptyArrayException extends Exception{
    public EmptyArrayException(){
        super("Array is empty");
    }
}
