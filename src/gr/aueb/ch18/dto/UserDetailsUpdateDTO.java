package gr.aueb.ch18.dto;

public class UserDetailsUpdateDTO extends BaseDTO{
    private String firstname;
    private String lastname;

    public UserDetailsUpdateDTO() {
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
