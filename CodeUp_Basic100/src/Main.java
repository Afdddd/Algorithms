import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String[] split = sc.nextLine().split(" ");
        int w = Integer.parseInt(split[0]);
        int h = Integer.parseInt(split[1]);
        int b = Integer.parseInt(split[2]);
        cal(w, h ,b);

    }

    public static void cal(int w, int h, int b) {
        double r = (double) w*h*b;
        double pow = Math.pow(1024, 2);
        double result = r / (pow*8);
        System.out.printf("%.2f MB",result);

    }
}
