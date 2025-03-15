package lr2;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите текст для шифрования: ");
        String text = sc.nextLine();

        System.out.print("Введите ключ: ");
        int key = sc.nextInt();

        String newString = getEncryptString(text, key);
        System.out.println("Текст после преобразования: " + newString);

        while(true){
            System.out.print("Выполнить обратное преобразование? (y/n)");
            String res = sc.nextLine();

            if(res.equals("y")){
                String oldString = getEncryptString(newString, -key);
                System.out.println("Исходный текст: " + oldString);
                break;
            } else if(res.equals("n")){
                break;
            }

            System.out.println("\nВведите корректный ответ");
        }
    }

    public static String getEncryptString(String encryptString, int shift) {
        char[] arrayChar = encryptString.toCharArray();
        long[] arrayInt = new long[arrayChar.length];
        char[] arrayCharNew = new char[arrayChar.length];

        for (int i = 0; i < arrayChar.length; i++) {
            arrayInt[i] = arrayChar[i] + shift;
            arrayCharNew[i] = (char) arrayInt[i];
        }

        encryptString = new String(arrayCharNew);

        return encryptString;
    }
}
