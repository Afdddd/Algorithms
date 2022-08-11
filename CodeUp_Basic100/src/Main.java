import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] nums = br.readLine().split(" ");
        long a = Long.parseLong(nums[0]);
        long m = Long.parseLong(nums[1]);
        long d = Long.parseLong(nums[2]);
        long n = Long.parseLong(nums[3]);

        for (int i = 1; i < n; i++) {
            a = a*m+d;
        }
        bw.write(String.valueOf(a));
        bw.flush();
        bw.close();
    }
}