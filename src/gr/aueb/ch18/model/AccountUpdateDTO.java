package gr.aueb.ch18.model;

import gr.aueb.ch18.dto.BaseDTO;
import gr.aueb.ch18.dto.UserDetailsInsertDTO;

public class AccountUpdateDTO extends BaseDTO {
    private UserDetailsInsertDTO userDetailsInsertDTO;
    private String iban;
    private String ssn;
    private double balance;

    public AccountUpdateDTO() {
    }

    public UserDetailsInsertDTO getUserDetailsInsertDTO() {
        return userDetailsInsertDTO;
    }

    public void setUserDetailsInsertDTO(UserDetailsInsertDTO userDetailsInsertDTO) {
        this.userDetailsInsertDTO = userDetailsInsertDTO;
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
}
