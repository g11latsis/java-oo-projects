package gr.aueb.ch18.dao;

import gr.aueb.ch18.model.Account;

import java.util.List;

public interface IAccountDAO {
    Account insert(Account account);
    Account update(Account account);
    void delete(Long id);
    Account get(Long id);
    Account get(String iban);
    List<Account> getAll();
    boolean ibanExists(String iban);
    boolean userIdExists(Long id);
    void delete(String iban);
}
