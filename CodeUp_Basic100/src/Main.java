import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strings = sc.next().split("\\.");
        int yyyy = Integer.parseInt(strings[0]);
        int mm = Integer.parseInt(strings[1]);
        int dd = Integer.parseInt(strings[2]);
        System.out.format("%02d-%02d-%04d", dd, mm, yyyy);
    }
}