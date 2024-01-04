package gr.aueb.ch12.bankApp;

public class Main {
    public static void main(String[] args) {

        Account ac1 = new Account(5, "123456", "Grigoris", "Latsis", "hshsjs", 12500);

        try {
            ac1.deposit(15);
            System.out.println(ac1);

            ac1.withdraw(12000,"hshsjs");
            System.out.println(ac1);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
