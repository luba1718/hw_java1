/**
 * task1
 */
/*
 Вычислить n-ое треугольного число(сумма чисел от 1 до n),
 а так же n! (произведение чисел от 1 до n)
Ввод:5
Треугольное число 1 + 2 + 3 + 4 + 5 = 15*/
import java.util.Scanner;
public class task1 {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int i = iScanner.nextInt();
        System.out.printf("Треугольное число: %d\n", Number(i));
        iScanner.close();
    }
    public static int Number(int a) {
        return (a * (a + 1)) / 2;       
    }
  
}
