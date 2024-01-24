package gr.aueb.ch19.dto;

public class AccountInsertDTO extends BaseDTO {
    private UserDetailsInsertDTO userDetailsInsertDTO;
    private String iban;
    private String ssn;
    private double balance;

    public AccountInsertDTO() {
    }

    public AccountInsertDTO(UserDetailsInsertDTO userDetailsInsertDTO, String iban, String ssn, double balance) {
        this.userDetailsInsertDTO = userDetailsInsertDTO;
        this.iban = iban;
        this.ssn = ssn;
        this.balance = balance;
    }


    public UserDetailsInsertDTO getUserDetailsInsertDTO() {
        return userDetailsInsertDTO;
    }

    public void setUserDetailsInsertDTO(UserDetailsInsertDTO userDetailsInsertDTO) {
        this.userDetailsInsertDTO = userDetailsInsertDTO;
    }

    @Override
    public String toString() {
        return "AccountInsertDTO{" +
                "userDetailsInsertDTO=" + userDetailsInsertDTO +
                ", iban='" + iban + '\'' +
                ", ssn='" + ssn + '\'' +
                ", balance=" + balance +
                '}';
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
