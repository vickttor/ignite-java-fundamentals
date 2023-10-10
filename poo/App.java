package fundamentals.poo;

import fundamentals.poo.person.Student;
import fundamentals.poo.person.Teacher;
import fundamentals.poo.bankAccount.BankAccount;

public class App {
  public static void main(String[] args) {

    Teacher teacher1 = new Teacher(5000.0, "Elias", 59);
    teacher1.printPersonData();
    System.out.println("Teacher's incomes: " + teacher1.getIncomes() + "\n");

    Student student1 = new Student(20062, "Victor", 18);

    student1.printPersonData();

    BankAccount account1 = new BankAccount(1, student1.getName(), 0.0);

    account1.deposit(55.5);
    account1.draw(30.0);
    account1.showAccountData();

  }
}
