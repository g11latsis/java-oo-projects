package gr.aueb.ch12.bankApp;

import gr.aueb.ch12.bankApp.model.JointAccount;
import gr.aueb.ch12.bankApp.model.OverdraftAccount;


/**
 * @author Grigoris
 */
public class Main {
    public static void main(String[] args) throws Exception {

        Account alice = new Account(1, "GR56478", "Alice", "W", "R456", 200);
        Account kate = new Account(2, "GR12345", "Kate", "W", "R456", 200);

        OverdraftAccount bob = new OverdraftAccount(1, "GR56478", "Βob", "W", "R456", 600);
        JointAccount jointAccount = new JointAccount(alice, kate);


        try {

            // Check overdraft account functionality
            bob.withdraw(700, "R456");
            System.out.println("Overdraft account balance :" + bob.getBalance());

            //Check jointAccount functionality
            jointAccount.deposit(500,alice,kate);
            jointAccount.withdraw(250,"R456",alice,kate);
            System.out.println("ALice balance:" +jointAccount.getAccountBalance(alice) + " Kate balance:" + jointAccount.getAccountBalance(kate));

        } catch (Exception e) {
            e.getMessage();
        }
    }
}
