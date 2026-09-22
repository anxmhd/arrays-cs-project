package samplearrays;

public class BankAccount {

    String name;
    double currentBalance;
    double[] transactions = new double[1000];
    int lastTransaction = 0;

    public BankAccount(String name, int startingBalance){
        this.name = name;
        this.currentBalance = startingBalance;
    }

    public void deposit(double amount){
        if(amount < 0) {
            System.out.println("Invalid amount");
            return;
        }
        currentBalance += amount;
        transactions[lastTransaction] = amount;
        lastTransaction++;
        System.out.println("The amount " + amount + " MAD was successfully deposited to " + name + "'s balance. Current Balance : " + currentBalance);
    }

    public void withdraw(double amount){
        if(amount > currentBalance || amount < 0) {
            System.out.println("Invalid Withdraw");
        }
        else {
            currentBalance -= amount;
            transactions[lastTransaction] = -amount;
            lastTransaction++;
            System.out.println("The amount " + amount + " MAD was successfully withdrawn from " + name + "'s balance. Current Balance : " + currentBalance);
        }
    }

    public void displayTransactions(){
        System.out.println("Transactions :");
        for(double transaction : transactions) System.out.println(transaction + " ");
    }

    public void displayBalance(){
        System.out.println("Balance : " + currentBalance);
    }

    public static void main(String[] args) {

        BankAccount john = new BankAccount("John Doe", 100);

        // ----- DO NOT CHANGE -----

        //Testing..
        john.displayBalance();
        john.deposit(0.25);
        john.withdraw(100.50);
        john.withdraw(40.90);
        john.deposit(-90.55);
        john.deposit(3000);
        john.displayTransactions();
        john.displayBalance();

        // ----- DO NOT CHANGE -----

    }

}
