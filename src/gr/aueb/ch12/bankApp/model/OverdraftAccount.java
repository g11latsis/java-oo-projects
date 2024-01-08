package gr.aueb.ch12.bankApp.model;

import gr.aueb.ch12.bankApp.Account;


/**
 * The OverdraftAccount class represents an account that allows overdrafts
 * based on the Account class functionality.
 * It provides methods to withdraw money while allowing a negative balance.
 *
 * @author Grigoris
 */
public class OverdraftAccount {

    private Account account;

    public OverdraftAccount() {
    }


    public OverdraftAccount(int id, String iban, String firstname, String lastname, String ssn, double balance) {
        this.account = new Account(id, iban, firstname, lastname, ssn, balance);
    }

    /**
     * Withdraws a specified amount from the account, allowing a negative balance.
     *
     * @param amount The amount to be withdrawn.
     * @param ssn    The social security number for verification.
     * @throws Exception if the social security number is invalid or in case of other exceptions.
     */
    public void withdraw(double amount, String ssn) throws Exception {
        try {
            if (!account.isSsnValid(ssn)) {
                throw new Exception("Bad ssn");
            }

            account.setBalance(account.getBalance() - amount);

        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    /**
     * Retrieves the current balance of the account.
     *
     * @return The current balance of the account.
     */
    public double getBalance() {
        return account.getBalance();
    }

    /**
     * Returns a string representation of the OverdraftAccount.
     *
     * @return A string containing the account details.
     */
    @Override
    public String toString() {
        return "OverdraftAccount{" +
                "id=" + account.getId() +
                ", iban='" + account.getIban() + '\'' +
                ", firstname='" + account.getFirstname() + '\'' +
                ", lastname='" + account.getLastname() + '\'' +
                ", ssn='" + account.getSsn() + '\'' +
                ", balance=" + account.getBalance() +
                '}';
    }
}
