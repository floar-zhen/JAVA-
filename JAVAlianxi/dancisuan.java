import java.util.Scanner;

public class dancisuan {
    public static int countSegments(String s) {
        int count =0;
        boolean isSpace=true;
        char[] chars = s.toCharArray();
        for (char c : chars) {
            // 空格 ASCII 为 32
            if(c != 32 && isSpace){
                count ++;
            }
            isSpace = c==32;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int m = countSegments(str);
        System.out.println(m);
    }
}
