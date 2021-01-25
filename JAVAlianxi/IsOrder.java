import java.util.ArrayList;
import java.util.Stack;
//判断序列是否为栈中数据可能出栈序列
public class IsOrder {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        if(pushA.length == 0 || popA.length == 0)
            return false;
        Stack<Integer> s = new Stack<Integer>();
        //用于标识弹出序列的位置
        int popIndex = 0;
        for(int i = 0; i< pushA.length;i++){
            s.push(pushA[i]);
            //如果栈不为空，且栈顶元素等于弹出序列
            while(!s.empty() &&s.peek() == popA[popIndex]){
                //出栈
                s.pop();
                //弹出序列向后一位
                popIndex++;
            }
        }
        return s.empty();
    }
    //用链表ArrayList实现
    public boolean IsPOrder(int [] pushA,int [] popA) {
        if(pushA.length==0||popA.length==0)
            return false;
        ArrayList<Integer> list  = new ArrayList<Integer>();
        int j = 0;
        for(int i = 0;i<pushA.length;i++){
            if(pushA[i]!=popA[j])
                list.add(pushA[i]);
            else
                j++;
        }
        for(int i = list.size()-1;i>=0;i--){
            if(list.get(i)!=popA[j])
                return false;
            j++;
        }
        return true;
    }
}
