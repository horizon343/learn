package lr2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the array size: ");
        int size = sc.nextInt();

        int[] nums = new int[size];

        Random rand = new Random();

        for (int i = 0; i < nums.length; i++)
            nums[i] = rand.nextInt(200);

        System.out.println("Generated array: " + Arrays.toString(nums));

        int min = nums[0];
        int[] indexes = new int[size];
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
                count = 0;
                indexes[count++] = i;
            } else if (nums[i] == min) {
                indexes[count++] = i;
            }
        }

        System.out.println("Minimum element: " + min);
        System.out.print("Indexes: ");
        for (int i = 0; i < count; i++)
            System.out.print(indexes[i] + ", ");
    }
}
