package com.ssm.service;

import com.ssm.dao.BooksDao;
import com.ssm.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface BooksService {

    /**
     * @author wangxixi
     * @return List<book>
     */
    List<Book> queryAllBooks();

    Book queryOneBookById(int bookId);

    boolean addOneBook(Book books);

    boolean modifyOneBook(Book books);

    /**
     * 括号中的是传参时候的别名字段，int后的是pojo中的字段
     *
     * */
    boolean removeOneBookById(int bookId);

}
