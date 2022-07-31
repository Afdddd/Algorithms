import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringTokenizer str = new StringTokenizer(scanner.nextLine(),".");
        int year = Integer.parseInt(str.nextToken());
        int month = Integer.parseInt(str.nextToken());
        int day = Integer.parseInt(str.nextToken());
        System.out.format("%04d.%02d.%02d", year, month, day);
    }
}