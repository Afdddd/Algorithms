import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringTokenizer str = new StringTokenizer(scanner.nextLine(),":");
        String hour = str.nextToken();
        String min = str.nextToken();
        System.out.println(hour + ":" + min);

    }
}