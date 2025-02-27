package lr1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        double number = sc.nextDouble();

        double leftNumber = number - 1;
        double rightNumber = number + 1;
        double squareSum = Math.pow(leftNumber + number + rightNumber, 2);

        System.out.println(leftNumber + " " + number + " " + rightNumber + " " + squareSum);
    }
}
