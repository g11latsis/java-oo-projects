package gr.aueb.ch18.model;

import java.util.Objects;

public class Account extends AbstractEntity{
    private UserDetails userDetails;
    private String iban;
    private String ssn;
    private double balance;

    public Account() {
    }

    public UserDetails getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(UserDetails userDetails) {
        this.userDetails = userDetails;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Account account = (Account) o;

        if (Double.compare(balance, account.balance) != 0) return false;
        if (!Objects.equals(userDetails, account.userDetails)) return false;
        if (!Objects.equals(iban, account.iban)) return false;
        return Objects.equals(ssn, account.ssn);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = userDetails != null ? userDetails.hashCode() : 0;
        result = 31 * result + (iban != null ? iban.hashCode() : 0);
        result = 31 * result + (ssn != null ? ssn.hashCode() : 0);
        temp = Double.doubleToLongBits(balance);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
