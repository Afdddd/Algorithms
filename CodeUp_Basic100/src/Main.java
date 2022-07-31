import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringTokenizer stt = new StringTokenizer(scanner.nextLine());
        String s1 = stt.nextToken();
        String s2 = stt.nextToken();
        System.out.print(s2+" "+s1);


    }
}