package fundamentals.poo.person;

public class Teacher extends Person {
  private Double incomes; 

  public Teacher(Double incomes, String name, int age) {
    super(name, age);

    this.incomes = incomes;
  }

  public Double getIncomes() {
    return incomes;
  }

  public void setIncomes(Double incomes) {
    this.incomes = incomes;
  }

  public void printPersonData() {
    super.printPersonData();
    System.out.println("You're a teacher\n");
  }
}
