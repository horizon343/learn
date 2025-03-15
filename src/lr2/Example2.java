package lr2;

import java.util.Arrays;
import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of lines: ");
        int rows = sc.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = sc.nextInt();

        int[][] nums = new int[rows][columns];

        for(int i = 0; i < rows * columns; i++){
            int row = i / columns;
            int col = (row % 2) == 0 ? i % columns : columns - i % columns - 1;

            nums[row][col] = i;
        }

        for (int[] row : nums) {
            System.out.println(Arrays.toString(row));
        }
    }
}
