package com.ssm.service.impl;

import com.ssm.dao.BooksDao;
import com.ssm.pojo.Books;
import com.ssm.service.BooksService;
import lombok.Data;
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
    public List<Books> findAllBooks() {
        return booksDao.findAllBooks();
    }

    @Override
    public Books findOneBookById(int bookId) {
        return booksDao.findOneBookById(bookId);
    }

    @Override
    public boolean addOneBook(Books books) {
        return booksDao.addOneBook(books);
    }

    @Override
    public boolean updateOneBook(Books books) {
        return booksDao.updateOneBook(books);
    }

    @Override
    public boolean deleteOneBookById(int bookId) {
        return booksDao.deleteOneBookById(bookId);
    }
}
