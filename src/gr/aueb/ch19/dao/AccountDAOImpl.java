package gr.aueb.ch19.dao;

import gr.aueb.ch19.model.Account;

import java.util.*;

public class AccountDAOImpl implements IAccountDAO {


    private static final Map<Long, Account> accounts = new HashMap<>();


    @Override
    public Account insert(Account account) {
        accounts.put(account.getId(),account);
        return account;
    }

    @Override
    public Account update(Account account) {
        return accounts.put(account.getId(), account);
    }

    @Override
    public void delete(Long id) {
        accounts.remove(id);
    }

    @Override
    public Account get(Long id) {
        return accounts.get(id);
    }

    @Override
    public Account get(String iban) {
       Optional<Account> account = accounts.values().stream()
               .filter(a -> a.getIban().equals(iban))
               .findFirst();

        return account.orElse(null);
    }

    @Override
    public List<Account> getAll() {
        return List.copyOf(accounts.values());
    }

    @Override
    public boolean ibanExists(String iban) {
        return accounts.values().stream()
                .anyMatch(a -> a.getIban().equals(iban));
    }

    @Override
    public boolean userIdExists(Long id) {
        return accounts.containsKey(id);
    }

    @Override
    public void delete(String iban) {
        accounts.values().removeIf((a -> a.getIban().equals(iban)));
    }
}
