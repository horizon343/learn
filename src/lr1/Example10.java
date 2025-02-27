package lr1;

import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your date of birth: ");
        int birthYear = sc.nextInt();

        int currentYear = 2025;
        int age = currentYear - birthYear;

        System.out.print("Did you have a birthday this year (yes/no)? : ");
        String birthday = sc.next();

        if(birthday.equals("no"))
            age--;

        System.out.println("User age: " + age);
    }
}
