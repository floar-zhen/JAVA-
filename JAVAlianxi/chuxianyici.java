
    import java.util.Scanner;

    public class dierci {
        public static void main(int[] args) {
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            str = str.substring(1, str.length() - 1);
            String[] s = str.split(",");//将字符串以","分割，转为一个字符串数组
            int[] arr = new int[s.length];//定义一个整形数组，准备用来存数据了
            for (int i = 0; i < arr.length; i++)
                arr[i] = Integer.parseInt(s[i]);//将字符串转为int类型数据存入整型数组中
            System.out.println(find(arr));//调方法
        }

        public static Integer find(int[] arr) {
            int i, j;
            for (i = 0; i < arr.length; i++) {
                int count = 1;
                for (j = 0; j < arr.length; j++) {
                    if (i == j) {
                        continue;
                    }
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                    if (count == 1) {
                        return arr[i];
                    }
                }
            }
            return null;
        }
    }

