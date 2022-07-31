import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        String[] strings = num.split("-");
        System.out.println(strings[0]+strings[1]);
    }
}