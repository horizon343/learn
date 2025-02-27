package lr1;

import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();

        int sum = number1 + number2;
        int difference = number1 - number2;

        System.out.print("The sum of the numbers is equal to " + sum + "\nThe difference of the numbers is equal to " + difference);
    }
}
