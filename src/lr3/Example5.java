package lr3;

public class Example5 {
    public static void main(String[] args) {
        System.out.println(fact(6));
    }

    public static int fact(int n){
        space();
        System.out.println(" " + n + "-> ");
        step++;

        if(n == 0) {
            printOut(n);

            return 0;
        }
        else if(n == 1) {
            printOut(n);

            return 1;
        }

        int result = fact(n - 2) + fact(n - 1);

        printOut(n);

        return result;
    }

    private static int step = 0;

    public static void space(){
        for(int i = 0 ; i < step ; i++){
            System.out.print(" ");
        }
    }

    private static void printOut(int n){
        step--;
        space();
        System.out.println(" " + n + " <-");
    }
}
