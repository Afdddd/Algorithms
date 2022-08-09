import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println(1<<10);
        Scanner sc = new Scanner(System.in);
        String[] split = sc.nextLine().split(" ");
        int h = Integer.parseInt(split[0]);
        int b = Integer.parseInt(split[1]);
        int c = Integer.parseInt(split[2]);
        int s = Integer.parseInt(split[3]);
        cal(h, b, c, s);

    }

    public static void cal(int h, int b, int c, int s) {
        double r = (double) h*b*c*s;
        double pow = Math.pow(1024, 2);
        double result = r / (pow*8);
        System.out.printf("%.1f MB",result);

    }
}
