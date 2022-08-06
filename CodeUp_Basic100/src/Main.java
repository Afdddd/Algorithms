import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 0;
        int sum =0 ;
        while (true) {
            i++;
            sum+=i;
            if (sum >= num) {
                System.out.println(i);
                break;
            }
        }
    }
}
