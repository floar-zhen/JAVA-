package user;

import book.BookList;
import operation.IOperation;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GaoBo
 * Date: 2021-01-18
 * Time: 9:49
 */
public abstract class User {

    public String name;
    public IOperation[] operations;

    public User(String name) {
        this.name = name;
    }

    public abstract int menu();

    public void doOperation(int choice, BookList bookList) {
        //看这个数组当中 存的到底是哪些操作
        this.operations[choice].work(bookList);
    }
}
