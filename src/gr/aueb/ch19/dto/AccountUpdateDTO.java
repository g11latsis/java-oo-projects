package gr.aueb.ch19.dto;

public class AccountUpdateDTO extends BaseDTO {
    private UserDetailsUpdateDTO userDetailsUpdateDTO;
    private String iban;
    private String ssn;
    private double balance;

    public AccountUpdateDTO() {
    }

    public UserDetailsUpdateDTO getUserDetailsUpdateDTO() {return userDetailsUpdateDTO;}

    public void setUserDetailsUpdateDTO(UserDetailsInsertDTO userDetailsInsertDTO) {
        this.userDetailsUpdateDTO = userDetailsUpdateDTO;
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