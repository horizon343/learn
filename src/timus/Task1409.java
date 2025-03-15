package timus;

import java.util.Arrays;

public class Task1409 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(numberCans(4, 7)));
    }

    public static int[] numberCans(int Garry, int Larry) {
        return new int[]{Larry - 1, Garry - 1};
    }
}
