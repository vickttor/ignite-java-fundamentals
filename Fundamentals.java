package fundamentals;

public class Fundamentals {
  // Class Scope

  public static void main(String[] args) {
    System.out.println("Hello World");

    System.out.println("\n==== DATA TYPES ====\n");
    dataTypes();

    System.out.println("\n==== CONDITIONAL CONTROL ====\n");
    conditionalControl();

    System.out.println("\n==== LOOPS ====\n");
    loops();
  }


  public static void dataTypes() {

    /**
     * Numbers (int, double, float, long)
     * Text (String)
     * boolean (True or False)
     * 
     */

    int aNumber = 10; // non-decimal numbers
    double aDoubleNumber = 3.14;
    float aFloatNumber = 3.14f; // The 'f' at the end forces the java understands the variable as Float and not double that is the default.
    long aReallyBigIntegerNumber = 190231278398127389L;
    String aText = "I'm learning java"; // We need to use String because it's a class which includes methods to manipulate the text, such as format().
    boolean aBoolean = true;
    char aLetter = 'A'; // It must use single quotes

    System.out.println("A integer number: " + aNumber);
    System.out.println("A double number: " + aDoubleNumber);
    System.out.println("A float number: " + aFloatNumber);
    System.out.println("A really big integer number: " + aReallyBigIntegerNumber);
    System.out.println("A String: " + aText);
    System.out.println("A Boolean: " + aBoolean);
    System.out.println("A char: " + aLetter);

  }

  public static void conditionalControl() {

    String name = "Victor";

    if(name.length() ==  6) {
      System.out.println("The lenght is 6");
    }else if(name.length() >= 6){
      System.out.println("It's a big name");
    }else{
      System.out.println("It's a short name");
    }
  }

  public static void loops() {
    
    // while
    int controler = 1;

    while(controler <= 10) {
      System.out.println(1 +" x 10 = " + (controler * 10));
      controler++;
    }

        System.out.println();

    // forEach
    String listName[] = {"Victor", "Lincon", "Pedro"};

    for (String name : listName) {
      System.out.println("Name: " + name);
    }

    System.out.println();

    // for
    for(int i = 0; i < 15; i++){
      if(i % 2 != 0) continue; // jumpping
      if(i == 10) break; // stopping;
      System.out.println("even Number: " + i);

    }

  }
}