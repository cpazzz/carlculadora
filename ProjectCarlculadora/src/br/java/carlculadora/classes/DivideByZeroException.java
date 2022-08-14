package br.java.carlculadora.classes;

public class DivideByZeroException extends Exception {

    public DivideByZeroException() {
        super("cannot divide by zero");
    }

    public DivideByZeroException(String message) {
        super(message);
    }
}
