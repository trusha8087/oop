import java.util.Scanner;

class BankAccount {

    String accountId;
    String accountHolderName;
    double balance;

    void assignValues(String id, String name, double bal) {
        accountId = id;
        accountHolderName = name;
        balance = bal;
    }

    void displayValues() {
        System.out.println("Account ID: " + accountId);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("----------------------");
    }

    static void searchAccount(BankAccount[] accounts, String searchId) {
        boolean found = false;

        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].accountId.equals(searchId)) {
                System.out.println("\nAccount Found:");
                accounts[i].displayValues();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("\nAccount with ID " + searchId + " not found.");
        }
    }

    public static void main(String[] args) {
	System.out.println("Enrollnment no. 240390107034");

        Scanner sc = new Scanner(System.in);

        BankAccount[] accounts = new BankAccount[5];

        accounts[0] = new BankAccount();
        accounts[0].assignValues("A101", "Trusha", 5000);

        accounts[1] = new BankAccount();
        accounts[1].assignValues("A102", "Janvi", 12000);

        accounts[2] = new BankAccount();
        accounts[2].assignValues("A103", "Krisha", 8000);

        accounts[3] = new BankAccount();
        accounts[3].assignValues("A104", "Dhruvi", 15000);

        accounts[4] = new BankAccount();
        accounts[4].assignValues("A105", "Mitul", 7000);

        System.out.println("All Bank Accounts:");
        for (int i = 0; i < accounts.length; i++) {
            accounts[i].displayValues();
        }

        System.out.print("Enter Account ID to search: ");
        String searchId = sc.nextLine();

        searchAccount(accounts, searchId);
    }
}