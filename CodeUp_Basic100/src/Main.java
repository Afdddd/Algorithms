import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer valueOf = Integer.valueOf(sc.next(), 16);
        String toOctalString = Integer.toOctalString(valueOf);
        System.out.println(toOctalString);

    }
}