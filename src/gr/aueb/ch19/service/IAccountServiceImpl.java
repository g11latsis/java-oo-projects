package gr.aueb.ch19.service;

import gr.aueb.ch19.dao.IAccountDAO;
import gr.aueb.ch19.dto.AccountInsertDTO;
import gr.aueb.ch19.dto.AccountUpdateDTO;
import gr.aueb.ch19.dto.UserDetailsInsertDTO;
import gr.aueb.ch19.dto.UserDetailsUpdateDTO;
import gr.aueb.ch19.model.Account;
import gr.aueb.ch19.model.UserDetails;
import gr.aueb.ch19.service.exceptions.AccountNotFoundException;
import gr.aueb.ch19.service.exceptions.IbanAlreadyExistsException;
import gr.aueb.ch19.service.exceptions.UserIdAlreadyExistsException;

import java.util.List;

public class IAccountServiceImpl implements IAccountService {

    private final IAccountDAO dao;

    public IAccountServiceImpl(IAccountDAO dao) {
        this.dao = dao;
    }

//    Services

    @Override
    public Account insertAccount(AccountInsertDTO accountInsertDTO) throws
            IbanAlreadyExistsException, UserIdAlreadyExistsException {
        Account account;
        try {
            account = new Account();
            mapInsertAccount(account, accountInsertDTO);

            if (dao.ibanExists(account.getIban())) {
                throw new IbanAlreadyExistsException(account);
            }

            if (dao.userIdExists(account.getId())) {
                throw new UserIdAlreadyExistsException(account);
            }

            return dao.insert(account);
        } catch (IbanAlreadyExistsException | UserIdAlreadyExistsException e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public Account updateAccount(AccountUpdateDTO accountUpdateDTO) throws
            AccountNotFoundException, IbanAlreadyExistsException {
        Account account;
        try {
            account = new Account();
            mapUpdateAccount(account, accountUpdateDTO);

            if (dao.ibanExists(account.getIban())) {
                throw new IbanAlreadyExistsException(account);
            }

            if (dao.userIdExists(account.getId())) {
                throw new AccountNotFoundException(account);
            }

            return dao.update(account);
        } catch (IbanAlreadyExistsException | AccountNotFoundException e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public void deleteAccountById(Long id) throws AccountNotFoundException {
        try {
            if (!dao.userIdExists(id)) {
                throw new AccountNotFoundException(id);
            }

            dao.delete(id);
        } catch (AccountNotFoundException e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public Account getAccount(Long id) throws AccountNotFoundException {
        Account account;

        try {
            account = dao.get(id);
            if (account == null) {
                throw new AccountNotFoundException(id);
            }

            return account;
        } catch (AccountNotFoundException e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public List<Account> getAllAccounts() {
        return dao.getAll();
    }

    @Override
    public Account getAccount(String iban) throws AccountNotFoundException {
        Account account;
        try {
            account = dao.get(iban);
            if (account == null) {
                throw new AccountNotFoundException(iban);
            }

            return account;
        } catch (AccountNotFoundException e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public void deleteAccount(String iban) throws AccountNotFoundException {
        try {
            if (!dao.ibanExists(iban)) {
                throw new AccountNotFoundException(iban);
            }
            dao.delete(iban);
        } catch (AccountNotFoundException e) {
            e.printStackTrace();
            throw e;
        }
    }

    //    Mappers
    private void mapInsertAccount(Account account, AccountInsertDTO accountInsertDTO) {
        account.setId(accountInsertDTO.getId());
        account.setBalance(accountInsertDTO.getBalance());
        account.setIban(accountInsertDTO.getIban());
        account.setSsn(accountInsertDTO.getSsn());
        UserDetails userDetails = new UserDetails();
        mapUserDetails(userDetails, accountInsertDTO.getUserDetailsInsertDTO());
        account.setUserDetails(userDetails);
    }

    private void mapUpdateAccount(Account account, AccountUpdateDTO accountUpdateDTO) {
        account.setId(accountUpdateDTO.getId());
        account.setBalance(accountUpdateDTO.getBalance());
        account.setIban(accountUpdateDTO.getIban());
        account.setSsn(accountUpdateDTO.getSsn());
        UserDetails userDetails = new UserDetails();
        mapUserDetails(userDetails, accountUpdateDTO.getUserDetailsUpdateDTO());
        account.setUserDetails(userDetails);
    }

    private void mapUserDetails(UserDetails userDetails, UserDetailsInsertDTO userDetailsInsertDTO) {
        userDetails.setId(userDetailsInsertDTO.getId());
        userDetails.setFirstname(userDetailsInsertDTO.getFirstname());
        userDetails.setLastname(userDetailsInsertDTO.getLastname());
    }

    private void mapUserDetails(UserDetails userDetails, UserDetailsUpdateDTO userDetailsUpdateDTO) {
        userDetails.setId(userDetailsUpdateDTO.getId());
        userDetails.setFirstname(userDetailsUpdateDTO.getFirstname());
        userDetails.setFirstname(userDetailsUpdateDTO.getLastname());
    }

}

