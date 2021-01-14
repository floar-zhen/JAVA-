package com.xpu.dao;

import com.xpu.bean.Book;
import com.xpu.util.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * @author baoly
 * @version 1.0
 * @date 2020/11/28 13:16
 * @description
 */
public class BookDao {
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    public List<Book> queryAllBooks() {
        String sql = "select * from tb_book";
        ArrayList<Book> bookList = new ArrayList<>();
        try {
            conn = DbUtil.getCon();
            pstmt = conn.prepareStatement(sql);//预编译sql语句
            rs = pstmt.executeQuery();
            // 获取查询的值
            while (rs.next()) {
                Book book = new Book();
                book.setBookId(rs.getInt("book_id"));
                book.setBookName(rs.getString("book_name"));
                book.setAuthorName(rs.getString("author_name"));
                bookList.add(book);
            }
            return bookList;

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DbUtil.close(conn, pstmt);
        }
        return null;
    }

    public Book queryBookById(int id) {
        String sql = "select * from tb_book where book_id = ?";
        try {
            conn = DbUtil.getCon();
            pstmt = conn.prepareStatement(sql);//预编译sql语句
            pstmt.setInt(1,id);
            rs = pstmt.executeQuery();
            Book book = new Book();
            // 获取查询的值
            while (rs.next()) {
                book.setBookId(rs.getInt("book_id"));
                book.setBookName(rs.getString("book_name"));
                book.setAuthorName(rs.getString("author_name"));
            }
            return book;

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DbUtil.close(conn, pstmt);
        }
        return null;
    }

    public int updateBookById(Book book) {
        String sql = "update tb_book set book_name = ?,author_name = ? where book_id = ?";
        try {
            conn = DbUtil.getCon();
            pstmt = conn.prepareStatement(sql);
            pstmt.setObject(1, book.getBookName());
            pstmt.setObject(2, book.getAuthorName());
            pstmt.setObject(3, book.getBookId());
            int i = pstmt.executeUpdate();
            return i;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DbUtil.close(conn, pstmt);
        }
        return 0;
    }
}
