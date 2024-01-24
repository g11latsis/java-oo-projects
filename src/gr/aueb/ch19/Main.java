package gr.aueb.ch19;

import gr.aueb.ch19.dao.AccountDAOImpl;
import gr.aueb.ch19.dao.IAccountDAO;
import gr.aueb.ch19.dto.AccountInsertDTO;
import gr.aueb.ch19.dto.UserDetailsInsertDTO;
import gr.aueb.ch19.model.Account;
import gr.aueb.ch19.service.IAccountServiceImpl;
import gr.aueb.ch19.service.exceptions.AccountNotFoundException;
import gr.aueb.ch19.service.exceptions.IbanAlreadyExistsException;
import gr.aueb.ch19.service.exceptions.UserIdAlreadyExistsException;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        IAccountDAO dao = new AccountDAOImpl();
        IAccountServiceImpl accountService = new IAccountServiceImpl(dao);

        try {

            //Accounts insertion
            UserDetailsInsertDTO userDetailsInsertDTO = new UserDetailsInsertDTO("Grigoris", "Latsis");
            AccountInsertDTO insertedAccount = new AccountInsertDTO(userDetailsInsertDTO, "GR123456", "ABC", 12500);
            insertedAccount.setId(1156L);
            Account account1 = accountService.insertAccount(insertedAccount);
            System.out.println("Accounts inserted: " + account1);


            UserDetailsInsertDTO userDetailsInsertDTO2 = new UserDetailsInsertDTO("George", "Latsis");
            AccountInsertDTO insertedAccount2 = new AccountInsertDTO(userDetailsInsertDTO2, "GR987654", "KLM", 20000);
            insertedAccount2.setId(22633L);
            Account account2 = accountService.insertAccount(insertedAccount2);
            System.out.println("Accounts inserted: " + account2);


            //Update account

            account1.setBalance(20000);
            account1.setIban("GR15000");
            account1.setSsn("KLM");
            System.out.println("Updated Account:" + account1);


            //Get account by ID
            Account retrievedByIdAccount = accountService.getAccount(account2.getId());
            System.out.println("Retrieved by id account:" + retrievedByIdAccount);

            //Delete account by ID
//            accountService.deleteAccountById(retrievedByIdAccount.getId());
//            System.out.println("Account with id: " + retrievedByIdAccount.getId() + " deleted");

            //Get Account by Iban
            Account retrievedByIban = accountService.getAccount("GR15000");
            System.out.println("Retrieved by iban account: " + retrievedByIban);

//            //Deleting by iban
//            accountService.deleteAccount(retrievedByIban.getIban());
//            System.out.println("Account deleted by IBAN: " + retrievedByIban.getIban());

            List<Account> allAccounts = accountService.getAllAccounts();
            System.out.println("All Accounts: " + allAccounts);

            dao.print();

        } catch (UserIdAlreadyExistsException | IbanAlreadyExistsException | AccountNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
