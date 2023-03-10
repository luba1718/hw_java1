/*n! 1 * 2 * 3 * 4 * 5 = 120  */
import java.io.IOException;
import java.util.Scanner;

public class task1_1 {
    public static void main(String[] args) throws IOException {
        try (Scanner console = new Scanner(System.in)) {
            System.out.println("Введите число ");
      int number = console.nextInt();
      System.out.println(number);
     int factorial = number;
     for(int i = (number - 1); i > 1; i--) {
             factorial = factorial * i;
     } 
     System.out.println("Факториал =  " + factorial);
        }
}
}