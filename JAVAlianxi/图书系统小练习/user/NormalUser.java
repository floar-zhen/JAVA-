package user;

import operation.*;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *  普通用户
 * User: GaoBo
 * Date: 2021-01-18
 * Time: 9:49
 */
public class NormalUser extends User {

    public NormalUser(String name) {
        super(name);
        this.operations = new IOperation[]{
                new ExitOperation(),
                new FindOperation(),
                new BorrowOperation(),
                new ReturnOperation()
        };
    }

    @Override
    public int menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===============================");
        System.out.println("hello " + this.name + "欢迎来到图书系统！");
        System.out.println("1.查找图书");
        System.out.println("2.借阅图书");
        System.out.println("3.归还图书");
        System.out.println("0.退出系统");
        System.out.println("===============================");
        int choice = scanner.nextInt();
        return  choice;
    }
}
