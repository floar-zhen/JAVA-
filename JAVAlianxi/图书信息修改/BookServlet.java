package com.xpu.servlet;

import com.xpu.bean.Book;
import com.xpu.dao.BookDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author baoly
 * @version 1.0
 * @date 2020/11/28 13:25
 * @description
 */
@WebServlet(name = "bookServlet", urlPatterns = "/bookServlet")
public class BookServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 设置请求编码集 防止接收参数乱码
        req.setCharacterEncoding("utf-8");
        // 设置响应格式为网页编码，编码为utf-8 防止输出乱码
        resp.setCharacterEncoding("utf-8");
        String type = req.getParameter("type");
        if ("edit".equals(type)) {
            String bookIdStr = req.getParameter("bookId");
            int bookId = Integer.valueOf(bookIdStr);
            BookDao bookDao = new BookDao();
            Book book = bookDao.queryBookById(bookId);
            req.setAttribute("book", book);
            req.getRequestDispatcher("editBook.jsp").forward(req, resp);
        } else if ("save".equals(type)) {
            String bookIdStr = req.getParameter("bookId");
            String bookName = req.getParameter("bookName");
            String authorName = req.getParameter("authorName");
            int bookId = Integer.valueOf(bookIdStr);
            Book book = new Book();
            book.setBookId(bookId);
            book.setBookName(bookName);
            book.setAuthorName(authorName);
            BookDao bookDao = new BookDao();
            int i = bookDao.updateBookById(book);
          req.getRequestDispatcher("index.jsp").forward(req,resp);

        } else {
            BookDao bookDao = new BookDao();
            List<Book> bookList = bookDao.queryAllBooks();
            req.setAttribute("bookList", bookList);
            req.getRequestDispatcher("bookList.jsp").forward(req, resp);
        }

    }
}
