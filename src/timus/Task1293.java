package timus;

public class Task1293 {
    public static void main(String[] args) {
        System.out.println(AmountSulfide(5, 2, 3));
        System.out.println(AmountSulfide(1, 1, 1));
        System.out.println(AmountSulfide(2, 1, 1));
        System.out.println(AmountSulfide(9, 5, 5));
    }

    public static int AmountSulfide(int N, int A, int B) {
        return 2 * N * A * B;
    }
}
