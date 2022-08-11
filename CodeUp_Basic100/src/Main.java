import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] nums = br.readLine().split(" ");
        int a = Integer.parseInt(nums[0]);
        int d = Integer.parseInt(nums[1]);
        int n = Integer.parseInt(nums[2]);

        for (int i = 1; i < n; i++) {
            a+=d;
        }
        bw.write(String.valueOf(a));
        bw.flush();
        bw.close();
    }
}