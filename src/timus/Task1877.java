package timus;

public class Task1877 {
    public static void main(String[] args) {
        System.out.println(BicycleCodes("0000", "0000"));
        System.out.println(BicycleCodes("0001", "0000"));
        System.out.println(BicycleCodes("0002", "0001"));
        System.out.println(BicycleCodes("0002", "0003"));
    }

    public static String BicycleCodes(String codeOne, String codeTwo){
        int codeOneInt = Integer.parseInt(codeOne);
        int codeTwoInt = Integer.parseInt(codeTwo);

        if (codeOneInt == codeTwoInt || codeOneInt % 10 == 0 || codeTwoInt % 10 != 0)
            return "yes";
        return "no";
    }
}
