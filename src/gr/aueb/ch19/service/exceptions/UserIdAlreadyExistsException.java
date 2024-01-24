package gr.aueb.ch19.service.exceptions;

import gr.aueb.ch19.model.Account;

public class UserIdAlreadyExistsException extends Exception{

    private final static long serialVersionUID = 1L;

    public UserIdAlreadyExistsException(Account account){
        super("User with id " + account.getId() + " already exists");
    }
}
