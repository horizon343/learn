package timus;

public class Task1296 {
    public static void main(String[] args) {
        System.out.println(BeginningAlphaPhase(new int[]{5, 1, 2, 3, 4, 5}));
        System.out.println(BeginningAlphaPhase(new int[]{3, -1, -5, -6}));
        System.out.println(BeginningAlphaPhase(new int[]{10, 31, -41, 59, 26, -53, 58, 97, -93, -23, 84}));
    }

    public static int BeginningAlphaPhase(int[] gravityIntensity){
        int max = 0;
        int currentMax = gravityIntensity[1];

        for (int i = 2; i < gravityIntensity.length; i++) {
            int currentGravity = gravityIntensity[i];

            currentMax = Math.max(currentGravity, currentMax + currentGravity);
            max = Math.max(max, currentMax);
        }

        return max;
    }
}
