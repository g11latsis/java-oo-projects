package gr.aueb.ch19.service;

import gr.aueb.ch19.dto.AccountInsertDTO;
import gr.aueb.ch19.dto.AccountUpdateDTO;
import gr.aueb.ch19.model.Account;
import gr.aueb.ch19.service.exceptions.AccountNotFoundException;
import gr.aueb.ch19.service.exceptions.IbanAlreadyExistsException;
import gr.aueb.ch19.service.exceptions.UserIdAlreadyExistsException;

import java.util.List;

public interface IAccountService {
    Account insertAccount(AccountInsertDTO accountInsertDTO)
            throws IbanAlreadyExistsException, UserIdAlreadyExistsException;

    Account updateAccount(AccountUpdateDTO accountUpdateDTO)
            throws AccountNotFoundException, IbanAlreadyExistsException;

    void deleteAccountById(Long id) throws AccountNotFoundException;

    Account getAccount(Long id) throws AccountNotFoundException;

    List<Account> getAllAccounts();

    Account getAccount(String iban) throws AccountNotFoundException;

    void deleteAccount(String iban) throws AccountNotFoundException;



}
