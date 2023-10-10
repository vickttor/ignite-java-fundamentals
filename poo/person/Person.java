package fundamentals.poo.person;

// Learning POO (Programming Object Oriented)

public class Person {
  
  private String name;
  private int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void showData() {
    System.out.println("Name: " + this.name);
    System.out.println("Age: " + this.age + "\n");
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return this.age;
  }

  public void setAge(int age) {
    this.age = age;
  }

}
