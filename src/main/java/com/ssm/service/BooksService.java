package com.ssm.service;

import com.ssm.dao.BooksDao;
import com.ssm.pojo.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface BooksService {

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
