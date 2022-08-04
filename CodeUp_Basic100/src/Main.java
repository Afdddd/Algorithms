import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        int i = (int) c+1;
        char c2 = (char)i;
        System.out.println(c2);

    }
}