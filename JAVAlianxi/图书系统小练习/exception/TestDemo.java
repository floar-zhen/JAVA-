package exception;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GaoBo
 * Date: 2021-01-18
 * Time: 11:43
 */
class Person implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class TestDemo {

    //throws:声明异常
    public static void func4(int y) throws ArithmeticException,NullPointerException {
        if(y == 0) {
            //抛出异常
            throw new ArithmeticException();
        }
        System.out.println(10/y);
    }

    public static void main(String[] args) {
        try {
           func4(0);
        }catch (ArithmeticException | NullPointerException e) {

        }
    }



    public static int func2() {
        try {
            int ret = 10/3;
            return ret;
        }catch (ArithmeticException e) {
            e.printStackTrace();
        }finally {
            //建议 不要在finally当中写 return
            return 10;
        }
    }

    public static void func3() {
        int[] arr = {1, 2, 3};
        arr = null;
        System.out.println(arr[100]);
    }
    public static void main7(String[] args) {
        try {
            func3();
        }catch (ArrayIndexOutOfBoundsException e) {

        }
        System.out.println("fafadsa");
    }

    public static void main6(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            System.out.println(10/n);
        }catch (ArithmeticException e) {
            e.printStackTrace();
        }finally {
            //作用：用于释放资源的。文件打开和关闭
            System.out.println("finally 肯定会被执行！不管是否会发生异常");
        }
        System.out.println("after");
    }

    public static void main5(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        try {
            System.out.println(10/n);
        }catch (ArithmeticException e) {
            e.printStackTrace();
        }finally {
            sc.close();
            //作用：用于释放资源的。文件打开和关闭
            System.out.println("finally 肯定会被执行！不管是否会发生异常");
        }
        System.out.println("after");
    }

    public static void main4(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println("before");
        try {
            System.out.println(arr[100]);
            System.out.println("上边发生异常 这里不会继续执行");
        }catch (Exception e) {
            //catch 捕获的异常 如果灭有 那么久交给JVM了
            e.printStackTrace();
        }
        System.out.println("fdsafdsafsa");
    }

    public static void main3(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println("before");
        try {
            System.out.println(arr[100]);
            System.out.println("上边发生异常 这里不会继续执行");
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            //catch 捕获的异常 如果灭有 那么久交给JVM了
            e.printStackTrace();
        }

        System.out.println("fdsafdsafsa");
    }

    public static void main2(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println("before");
        try {
            System.out.println(arr[100]);
            System.out.println("上边发生异常 这里不会继续执行");
        }catch (ArithmeticException e) {
            //catch 捕获的异常 如果灭有 那么久交给JVM了
            e.printStackTrace();
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("捕获了数组越界异常！");
        }
        System.out.println("fdsafdsafsa");
    }


    public static void main1(String[] args) {
        int a = 0;
        try {
            //存放的是可能会出现异常的代码
            System.out.println(10 / a);
        }catch (ArithmeticException  e) {
            //处理异常
            e.printStackTrace();
        }
        //如果使用try处理了异常，那么程序会继续执行
        //如果不处理 那么这个异常就会交给JVM来处理
        //一旦交个JVM处理异常 那么程序将异常终止  且不会继续执行
        System.out.println("fafsafsadsfsafsdsafsafa");
    }
}
