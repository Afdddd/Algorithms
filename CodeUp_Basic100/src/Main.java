import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        int sum = 0;
        int i = 0;
        while (true) {
            if (sum >= num) {
                break;
            }
            i++;
            sum+=i;
        }
        String s = String.valueOf(sum);
        bw.write(s);
        bw.flush();
        bw.close();
    }
}