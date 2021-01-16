import java.util.Scanner;
public class diyici {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个数");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                int sum = i * j;
                System.out.print(j + "*" + i + "*" + sum);
            }
            System.out.println();
        }
    }
}
