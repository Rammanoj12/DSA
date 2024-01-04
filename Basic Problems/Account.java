import java.util.Scanner;

class Account{
  int accountNumber;
  String Name;
  int account;
  class currentAccount extends Account{
        void accountOpen(String userAccount){
          final int balance = 20000;
          int depositAmount = sbAccount.deposit();
    System.out.println(depositAmount);
    int totalBalance = sbAccount.withDraw();
    System.out.println(totalBalance);


        }
        static int deposit(int  userDeposit){
          System.out.println("Enter the Deposit Amount:");
          int totalAmount = balance + userDeposit;
          return totalAmount;


        }
        static int withDraw(int userWithDraw){
          System.out.println("Enter the Withdraw Amount:");
          int totalAmount = depositAmount - userWithDraw;
          return totalAmount;

        }
  }
  class  sbAccount extends Account{
    void accountOpen(String userAccount){
    final int balance = 10000;
    int interest = balance * 400;
    int depositAmount = sbAccount.deposit();
    System.out.println(depositAmount);
    int totalBalance = sbAccount.withDraw();
    System.out.println(totalBalance);


    }
    static int deposit(int  userDeposit){
      System.out.println("Enter the Deposit Amount:");
          int totalAmount = (balance + userDeposit);
          return totalAmount;

    }
    static int  withDraw(int userWithDraw){
      System.out.println("Enter the Withdraw Amount:");
          int bankBalance = (depositAmount - userWithDraw);
          return bankBalance;
      
    }
}
  

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the account type:");
    String userAccount = sc.next();// Reads the user account

    int userDeposit = sc.nextInt();// Reads the user deposit
    int userWithDraw = sc.nextInt();// Reads the user withdraw

    currentAccount.deposit(userDeposit);// passing the value to method
    currentAccount.withDraw(userWithDraw);// passing the value to metho

    sbAccount.deposit(userDeposit);// passing the value to metho
    sbAccount.withDraw(userWithDraw);// passing the value to metho

    Account obj = new currentAccount();//created an object with obj-->polymorphism runtime
    Account obj1 = new sbAccount();//created an object with obj1

    obj.accountOpen(userAccount);//calling
    obj1.accountOpen(userAccount);//calling


    

  }
}