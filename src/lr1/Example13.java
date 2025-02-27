package lr1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double number1 = sc.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = sc.nextDouble();

        double sum = number1 + number2;

        System.out.println("Sum of numbers: " + sum);
    }
}
