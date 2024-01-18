package gr.aueb.ch18.service.exceptions;

import gr.aueb.ch18.model.Account;

public class UserIdAlreadyExistsException extends Exception{

    private final static long serialVersionUID = 1L;

    public UserIdAlreadyExistsException(Account account){
        super("User with id " + account.getId() + " already exists");
    }
}
