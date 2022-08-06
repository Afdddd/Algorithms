import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while (true) {
            --num;
            if (num < 0) {
                break;
            }
            System.out.println(num);

        }
    }

}
