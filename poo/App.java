package fundamentals.poo;

import fundamentals.poo.person.Person;
import fundamentals.poo.bankAccount.BankAccount;


public class App {
  public static void main(String[] args) {

    Person person1 = new Person("Victor",18);
    person1.showData();

    BankAccount account1 = new BankAccount(1, person1.getName(), 0.0);

    account1.deposit(55.5);

    account1.draw(30.0);

    account1.showAccountData();


  }
}
