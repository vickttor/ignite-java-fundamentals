package fundamentals.poo.person;

public class Student extends Person {

  private int RA;

  public Student(int RA, String name, int age) {
    super(name, age);
    this.RA = RA;
  }

  public int getRA() {
    return RA;
  }

  public void setRA(int rA) {
    RA = rA;
  }

  public void printPersonData() {
    super.printPersonData();
    System.out.println("You're a student\n");
  }
}