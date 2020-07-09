package com.ssm.dao;

import com.ssm.pojo.Books;
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
    List<Books> findAllBooks();

    Books findOneBookById(int bookId);

    boolean addOneBook(Books books);

    boolean updateOneBook(Books books);

    /**
     * 括号中的是传参时候的别名字段，int后的是pojo中的字段
     *
     * */
    boolean deleteOneBookById(int bookId);



}
