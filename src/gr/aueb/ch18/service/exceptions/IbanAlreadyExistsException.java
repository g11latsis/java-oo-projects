package gr.aueb.ch18.service.exceptions;

import gr.aueb.ch18.model.Account;

public class IbanAlreadyExistsException extends Exception{
    private final static long serialVersionUID = 1L;

    public IbanAlreadyExistsException(Account account){
        super("Account with iban:" + account.getIban() + "already exists" );
    }
}
