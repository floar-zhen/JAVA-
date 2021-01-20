import java.util.*;
class danCi {
        public static int countSegments(String s) {
            int count = 0;
            boolean flag = true;
            for(int i=0;i<s.length();i++){
                char c = s.charAt(i);
                if(c !=' '&&flag){
                    count++;
                }
                flag= c == ' ';
            }
            return count;
        }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            int m = countSegments(str);
            System.out.println(m);
        }
    }

