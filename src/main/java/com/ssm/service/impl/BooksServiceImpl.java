package com.ssm.service.impl;

import com.ssm.dao.BooksDao;
import com.ssm.pojo.Book;
import com.ssm.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wangxixi
 */


@Service("BooksService")
public class BooksServiceImpl implements BooksService {

    @Autowired
    private BooksDao booksDao;

    @Override
    public List<Book> queryAllBooks() {
        return booksDao.selectAllBooks();
    }

    @Override
    public Book queryOneBookById(int bookId) {
        return booksDao.selectOneBookById(bookId);
    }

    @Override
    public boolean addOneBook(Book book) {
        return booksDao.insertOneBook(book);
    }

    @Override
    public boolean modifyOneBook(Book book) {
        return booksDao.updateOneBook(book);
    }

    @Override
    public boolean removeOneBookById(int bookId) {
        return booksDao.deleteOneBookById(bookId);
    }
}
