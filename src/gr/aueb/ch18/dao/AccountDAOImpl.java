package gr.aueb.ch18.dao;

import gr.aueb.ch18.model.Account;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AccountDAOImpl implements IAccountDAO{
    private static final List<Account> accounts = new ArrayList<>();


    @Override
    public Account insert(Account account) {
        accounts.add(account);
        return account;
    }

    @Override
    public Account update(Account account) {
        return accounts.set(accounts.indexOf(account),account);
    }

    @Override
    public void delete(Long id) {
        accounts.removeIf((account -> account.getId().equals(id)));
    }

    @Override
    public Account get(Long id) {
        Optional<Account> account = accounts.stream()
                .filter(a -> a.getId().equals(id))
                .findFirst();

        return account.orElse(null);
    }

    @Override
    public List<Account> getAll() {
        return new ArrayList<>(accounts);
    }

    @Override
    public boolean ibanExists(String iban) {
        return accounts.stream()
                .anyMatch(a -> a.getIban().equals(iban));
    }

    @Override
    public boolean ssnExists(String ssn) {
        return accounts.stream()
                .anyMatch(a -> a.getSsn().equals(ssn));
    }

    @Override
    public void delete(String iban) {
        accounts.removeIf(a -> a.getIban().equals(iban));
    }
}
