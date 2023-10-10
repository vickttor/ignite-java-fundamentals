package fundamentals.poo.bankAccount;

// Encapsulation
public class BankAccount {
  
  // By using the private, we're saying we can't access this properties directly.
  // Instead, we use getters to retrieve and setters to set new values.
  private int number;
  private String holder;
  private double balance;

  public BankAccount(int number, String holder, double balance) {
    this.number = number;
    this.holder = holder;
    this.balance = balance;
  }

  public void deposit(double value) {
    if(value > 0) {
      balance += value;
      System.out.println("Deposit of $" + value + ". Actual balance: $" + balance);
    }else{
      System.out.println("The value to deposit is invalid.");
    }
  }

  public void draw(double value){
    if(value > 0 && value <= balance) {
      balance -= value;
      System.out.println("Draw of $" + value + ". Actual balance: $" + balance);
    }
  }

  public void showAccountData() {
    System.out.println("| Account: " +  number);    
    System.out.println("| Holder: " +  holder);
    System.out.println("| Balance: $" +  balance);
  }

  

}
