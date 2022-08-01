import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        char[] data = new char[line.length()];
        for (int i = 0; i < line.length(); i++) {
            data[i] = line.charAt(i);
        }
        System.out.println("["+data[0]+"0000]");
        System.out.println("["+data[1]+"000]");
        System.out.println("["+data[2]+"00]");
        System.out.println("["+data[3]+"0]");
        System.out.println("["+data[4]+"]");

    }
}