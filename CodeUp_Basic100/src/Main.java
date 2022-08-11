import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0) {
                continue;
            }
            String s = String.valueOf(i);
            bw.write(s+" ");
        }
        bw.flush();
        bw.close();
    }
}