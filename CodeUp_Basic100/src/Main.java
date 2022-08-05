import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int numAdd = num1+num2+num3;
        float numAve = (float) numAdd/3;
        System.out.println(numAdd);
        System.out.format("%.1f",numAve);
    }
}