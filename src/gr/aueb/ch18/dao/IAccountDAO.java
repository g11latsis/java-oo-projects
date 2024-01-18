package gr.aueb.ch18.dao;

import gr.aueb.ch18.model.Account;

import java.util.List;

public interface IAccountDAO {
    Account insert(Account account);
    Account update(Account account);
    void delete(Long id);
    Account get(Long id);
    List<Account> getAll();
    boolean ibanExists(String iban);
    boolean ssnExists(String ssn);
    void delete(String iban);
}
