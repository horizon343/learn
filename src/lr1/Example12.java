package lr1;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        int currentYear = 2025;
        int birthYear = currentYear - age;

        System.out.print("Did you have a birthday this year (yes/no)? : ");
        String birthday = sc.next();

        if(birthday.equals("no"))
            birthYear--;

        System.out.print("Your year of birth: " + birthYear);
    }
}
