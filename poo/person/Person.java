package fundamentals.poo.person;

// Learning POO (Programming Object-Oriented)

public class Person {
  
  private String name;
  private int age;
  private String cpf;

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

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public void printPersonData() {
    System.out.println("The person's name is " + name + ", the age is " +
            age + "and his document is " + cpf);
  }

}
