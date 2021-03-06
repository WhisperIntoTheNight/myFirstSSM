package com.ssm.controller;

import com.ssm.pojo.Book;
import com.ssm.service.BooksService;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author 10216
 */
@Controller
@RequestMapping("book")
public class BooksController {
    // controller就调用service层

    @Autowired
    @Qualifier("BooksService")
    private BooksService booksService;

//    查询全部的书籍，并且放回到一个书籍的展示
    @GetMapping("/allBook")
    public String list(Model model){
        List<Book> books = booksService.queryAllBooks();
        System.out.println(books);
        model.addAttribute("list", books);
        return "allBook";
    }
}
