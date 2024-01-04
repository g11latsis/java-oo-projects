package gr.aueb.ch11;

public class Main {

    public static void main(String[] args) {

        User bob = new User(1,"Bob","Ross");
        UserCredentials bobCreds = new UserCredentials(1,"bob4568" , "qwerty");

        System.out.println(bob);
        System.out.println(bobCreds);
    }
}
