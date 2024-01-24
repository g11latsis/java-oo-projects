package gr.aueb.ch19.service.exceptions;

import gr.aueb.ch19.model.Account;

public class AccountNotFoundException extends Exception {

    private final static long serialVersionUID = 1L;

    public AccountNotFoundException(String iban){
        super("Account with iban:" + iban + "not found" );
    }

    public AccountNotFoundException(Long id){
        super("Account with id:" + id + "not found" );
    }

    public AccountNotFoundException(Account account){
        super("Account with iban:" + account.getIban() +  "and id " + account.getId() + "not found");
    }
}
