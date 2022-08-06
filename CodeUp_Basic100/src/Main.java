import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.nextLine().charAt(0);
        for (int i = (int)'a' ; i <= c; i++) {
            char dd = (char) i;
            System.out.print(dd+" ");
        }

    }
}