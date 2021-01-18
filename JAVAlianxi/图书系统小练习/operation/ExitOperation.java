package operation;

import book.BookList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GaoBo
 * Date: 2021-01-18
 * Time: 10:03
 */
public class ExitOperation implements IOperation{

    @Override
    public void work(BookList bookList) {
        System.out.println("退出系统");
        System.exit(1);
    }
}
