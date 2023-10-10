package fundamentals.exceptions;

public class Exceptions {

    // Checked exceptions -> The java compiler will require you handle the error manually.
    // Unchecked exceptions -> unverified errors that we can't preview.

    public static void main(String[] args) {
        try {
            validarNumero();
        }catch (Exception e) {
            System.out.println(e.getMessage());
            // e.printStackTrace(); give more details
        }

    }

    public static void validarNumero() throws Exception {
        int number = 10;
        if(number < 100) {
            throw new Exception("The number is lower than 100");
        }
    }

}
