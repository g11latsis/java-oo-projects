package gr.aueb.ch13;

/**
 * The User class represents a basic user entity with an ID, first name, and last name.
 */
public class User {

    private Long id;
    private String firstname;
    private String lastname;

    /**
     * Constructs an empty User.
     */
    public User() {
    }

    /**
     * Constructs a User with specified details.
     *
     * @param id         The unique identifier for the user.
     * @param firstname  The first name of the user.
     * @param lastname   The last name of the user.
     */
    public User(Long id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    /**
     * Retrieves the ID of the user.
     *
     * @return The ID of the user.
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the ID of the user.
     *
     * @param id The ID to set for the user.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Retrieves the first name of the user.
     *
     * @return The first name of the user.
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Sets the first name of the user.
     *
     * @param firstname The first name to set for the user.
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * Retrieves the last name of the user.
     *
     * @return The last name of the user.
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Sets the last name of the user.
     *
     * @param lastname The last name to set for the user.
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * Returns a string representation of the User.
     *
     * @return A string containing the user's ID, first name, and last name.
     */
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
