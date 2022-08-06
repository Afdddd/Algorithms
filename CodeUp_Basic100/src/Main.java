import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        String[] nums = sc.nextLine().split(" ");
        for (int i = 0; i < nums.length; i++) {
            int numA = Integer.parseInt(nums[i]);
            if (numA == 0) {
                break;
            }else {
                System.out.println(numA);
            }
        }
    }

}
