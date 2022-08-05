import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(num1<<num2);
    }
}
//a를 이진수로 101이라고 했을 때, <<1을 해주면 1010, <<2을 해주면 10100, ... 으로 한칸씩 늘어납니다.
//n번 해주면 n번 왼쪽으로 밀릴 테니 2^n배가 되겠죠?