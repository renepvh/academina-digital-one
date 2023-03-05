package me.dio.academia.digital.handlerErrors;

public class EntityNotFoundException extends RuntimeException{
    public EntityNotFoundException(String mensagem) {
        super(mensagem);
    }
}
