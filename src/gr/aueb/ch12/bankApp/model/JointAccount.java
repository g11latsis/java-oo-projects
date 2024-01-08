package gr.aueb.ch12.bankApp.model;

import gr.aueb.ch12.bankApp.Account;

/**
 * The JointAccount class represents an account shared by two account holders.
 * It facilitates joint operations like depositing, withdrawing, and balance inquiries
 * for both holders.
 *
 * @author Grigoris
 */
public class JointAccount {
    private Account firstHolder;
    private Account secondHolder;

    public JointAccount(Account firstHolder, Account secondHolder) {
        this.firstHolder = firstHolder;
        this.secondHolder = secondHolder;
    }

    public Account getFirstHolder() {
        return firstHolder;
    }

    public Account getSecondHolder() {
        return secondHolder;
    }

    /**
     * Deposits an amount into the JointAccount, splitting it equally between holders.
     *
     * @param amount       The amount to deposit.
     * @param firstHolder  The first account holder.
     * @param secondHolder The second account holder.
     * @throws Exception if any issues arise during the deposit process.
     */
    public void deposit(double amount, Account firstHolder, Account secondHolder) throws Exception {
        firstHolder.deposit(amount);
        secondHolder.deposit(amount);
    }

    /**
     * Withdraws an amount from the JointAccount, affecting both holders equally.
     *
     * @param amount       The amount to withdraw.
     * @param ssn          The social security number for verification.
     * @param firstHolder  The first account holder.
     * @param secondHolder The second account holder.
     * @throws Exception if any issues arise during the withdrawal process.
     */
    public void withdraw(double amount, String ssn, Account firstHolder, Account secondHolder) throws Exception {
        firstHolder.withdraw(amount, ssn);
        secondHolder.withdraw(amount, ssn);
    }

    public double getAccountBalance(Account account) {
        return account.getBalance();
    }

    /**
     * Retrieves the balance of a specific account holder.
     *
     * @param account   The account holder to check balance for.
     * @return          The balance of the specified account holder.
     */
    public double getBalance(Account account, Account account2) {
        return getAccountBalance(account) + getAccountBalance(account2);
    }

    /**
     * Returns a string representation of the JointAccount.
     *
     * @return A string containing details of both account holders.
     */
    @Override
    public String toString() {
        return "JointAccount{" +
                "firstHolder=" + firstHolder +
                ", secondHolder=" + secondHolder +
                '}';
    }
}
