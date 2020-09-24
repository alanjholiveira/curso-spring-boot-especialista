package org.curso.java.exception;

public class SenhaInvalidaExpetion extends RuntimeException {

    public SenhaInvalidaExpetion() {
        super("Senha inválida");
    }

}
