package com.ssm.dao;

import com.ssm.pojo.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author wangxixi
 */

@Repository
public interface BooksDao {

    /**
     * @author wangxixi
     */
    List<Book> selectAllBooks();

    Book selectOneBookById(int bookId);

    boolean insertOneBook(Book books);

    boolean updateOneBook(Book books);

    /**
     * 括号中的是传参时候的别名字段，int后的是pojo中的字段
     *
     * */
    boolean deleteOneBookById(int bookId);



}
