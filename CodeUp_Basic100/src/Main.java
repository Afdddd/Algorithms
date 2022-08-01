import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] chars = new char[50];
        String line = scanner.nextLine();


        for(int i=0;i<line.length();i++){
            chars[i] = line.charAt(i);
            System.out.println("\'"+chars[i]+"\'");

        }

    }
}