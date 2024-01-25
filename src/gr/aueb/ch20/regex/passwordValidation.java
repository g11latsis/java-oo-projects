package gr.aueb.ch20.regex;


import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Password validator
 *
 * @author Grigoris
 */
public class passwordValidation {
    private static final String SPECIAL_CHARACTERS = "@#$%^&+=!";
    private static final String PASSWORD_REGEX =
            "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[" + Pattern.quote(SPECIAL_CHARACTERS) + "])(?=\\S+$).{8,}$";


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter a password:");
        String password = scanner.nextLine();
        List<String> errors = validatePassword(password);

        if (errors.isEmpty()) {
            System.out.println("Password is valid!");
            System.out.println("Your password: " + password);
        } else {
            System.out.println("Password is invalid. PLease note the following errors.");

            for (String error : errors) {
                System.out.println("- " + error);
            }
        }
    }

    /**
     * @param password The given password
     * @return A List with errors if
     * password isn't valid
     */
    public static List<String> validatePassword(String password) {
        List<String> errors = new ArrayList<>();

        if (!password.matches(PASSWORD_REGEX)) {
            if (!password.matches(".*[0-9].*")) {
                errors.add("Password must contain at least one digit.");
            }

            if (!password.matches(".*[a-z].*")) {
                errors.add("Password must contain at least one lowercase letter.");
            }

            if (!password.matches(".*[A-Z].*")) {
                errors.add("Password must contain at least one uppercase letter.");
            }

            if (!password.matches(".*[" + Pattern.quote(SPECIAL_CHARACTERS) + "].*")) {
                errors.add("Password must contain at least one special character from " + SPECIAL_CHARACTERS);
            }

            if (password.length() < 8) {
                errors.add("Password must be at least 8 characters long.");
            }
        }

        return errors;
    }

}
