import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = Integer.toHexString(sc.nextInt());
        System.out.println(s.toUpperCase());

    }
}