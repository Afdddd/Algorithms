import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] data = new int[num];
        for (int i = 0; i < num; i++) {
            data[i] = sc.nextInt();
        }
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }

}
