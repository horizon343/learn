package lr3;

public class Example7 {
    public static String toBinary(int n) {
        if (n == 0)
            return "0";
        if (n == 1)
            return "1";
        return toBinary(n / 2) + (n % 2);
    }

    public static void main(String[] args) {
        int number = 555;

        System.out.print("Двоичная система счисления: " + toBinary(number));
    }
}
