package com.example.dvcards.exeption;

public class DVCardsException extends IllegalStateException {
    private String publicMessage;

    public DVCardsException(String message, String publicMessage) {
        super(message);
        this.publicMessage = publicMessage;
    }

    public String getPublicMessage() {
        return this.publicMessage;
    }
}
