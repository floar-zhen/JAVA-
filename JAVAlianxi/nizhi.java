import java.util.*;
    public class Main{
        public static String reverse(String string, int left,int right){
            char[] arr = string.toCharArray();  //将String型字符串转化为数组
            while(left<right){ //进行字符串逆置
                char tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;
                left++;
                right--;
            }
            return String.valueOf(arr); //返回值为String型，所以要将数组转化为String
        }
        public static String reverseK(String str,int k){
            if(str == null||k<=0||k>str.length()){
                return null;
            }else{  //将字符串逆置三次，
                str = reverse(str,0,k-1);
                str = reverse(str,k,str.length()-1);
                str = reverse(str,0,str.length()-1);
                return str;
            }

        }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int k = sc.nextInt();
            String str = sc.next();
            String ret = reverseK(str,k);
            System.out.println(ret);
        }
    }
