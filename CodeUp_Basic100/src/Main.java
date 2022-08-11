import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] nums = br.readLine().split(" ");
        long a = Long.parseLong(nums[0]);
        long r = Long.parseLong(nums[1]);
        long n = Long.parseLong(nums[2]);

        for (int i = 1; i < n; i++) {
            a*=r;
        }
        bw.write(String.valueOf(a));
        bw.flush();
        bw.close();
    }
}