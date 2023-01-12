package bankAccount;

public class Account {

    public int accountBalance = 0;
    public int amount;



    //1. Step
    public static int deposit(int accountBalance, int amount) {
        accountBalance = accountBalance + amount;


        return accountBalance;
    }

    //2. Adim
    public static int withdraw(int accountBalance, int amount) {
        accountBalance = accountBalance - amount;

        return accountBalance;
    }

    //3. Step
    public static void transferToDifferentAccount(Customers sender, Customers receiver, int amount){

        if(amount<=sender.accountBalance1){

            sender.accountBalance1 = sender.accountBalance1 - amount;
            amount = (int) (amount - (amount * 0.02));
            receiver.accountBalance1 =receiver.accountBalance1 +amount;
            System.out.println("Checking transfer !!");
            try {
                Thread.sleep(2500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Transaction successful ! ");

        }else System.out.println("Insufficient account balance !! ");


    }

    //4. Step


public static void virman(Customers customerAccount, int amount){

        if(amount<=customerAccount.accountBalance1){

            customerAccount.accountBalance1 = customerAccount.accountBalance1 - amount;
            amount = (int) (amount - (amount * 0.01));
            customerAccount.accountBalance2 =customerAccount.accountBalance2 +amount;
            System.out.println("Checking transfer !!");
            try {
                Thread.sleep(2500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Transaction successful ! ");


        }else System.out.println("Insufficient account balance !! ");



}

}