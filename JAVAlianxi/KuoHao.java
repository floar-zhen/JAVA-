import java.util.Scanner;
import java.util.Stack;

public class KuoHao {
        public boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();
            for(int i = 0;i < s.length();i++) {
                char ch = s.charAt(i);
                if(ch == '(' || ch == '[' || ch == '{') {
                    //说明当前遍历到的字符是左括号
                    stack.push(ch);
                }else {
                    //1、判断当前的栈是否是空的
                    if(stack.empty()) {
                        System.out.println("右括号多");
                        return false;//代表右括号多
                    }
                    //2、拿到栈顶元素，看栈顶元素是否和当前的字符匹配，如果匹配当前栈顶元素出栈
                    char topch = stack.peek();
                    if(topch == '{' && ch == '}' || topch == '[' && ch == ']' || topch == '(' && ch == ')') {
                        stack.pop();
                    }else{
                        System.out.println("左右括号不匹配");
                        return false;//代表左右括号不匹配
                    }
                }
            }
            if(!stack.empty()) {
                System.out.println("左括号多");
                return false;//代表左括号多
            }
            return true;
        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    }
    }


