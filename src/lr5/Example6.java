package lr5;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Example6 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 4, 5, 6, 7};

        int[] intersection = findIntersection(array1, array2);

        System.out.println("Массив 1: " + Arrays.toString(array1));
        System.out.println("Массив 2: " + Arrays.toString(array2));
        System.out.println("Пересечение: " + Arrays.toString(intersection));
    }

    public static int[] findIntersection(int[] arr1, int[] arr2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> commonElements = new HashSet<>();

        for (int num : arr1)
            set1.add(num);

        for (int num : arr2) {
            if (set1.contains(num))
                commonElements.add(num);
        }

        int[] result = new int[commonElements.size()];
        int index = 0;
        for (int num : commonElements)
            result[index++] = num;

        return result;
    }
}
