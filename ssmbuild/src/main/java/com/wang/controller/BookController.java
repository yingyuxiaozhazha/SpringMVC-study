package com.wang.controller;

import com.wang.pojo.Book;
import com.wang.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {


    @Autowired
    private BookService bookService;
    public void setBookService(BookService bookService) {
        this.bookService = bookService;
    }
    @RequestMapping("/toAddBook")
    public String toAddBook(Book book) {
        return "addBook";
    }
    @RequestMapping("/addBook")
    public String addBook(Book book) {
        bookService.addBook(book);
        return "redirect:/book/allBook";
    }

    @RequestMapping("/deleteBook/{bookId}")
    public String deleteBook(@PathVariable("bookId") int id) {
        bookService.deleteBookById(id);
        return "redirect:/book/allBook";
    }

    @RequestMapping("/to/updateBook")
    public String updateBook(int id, Model model) {
        Book book = bookService.queryBookById(id);
        model.addAttribute("book",book);
        return "updateBook";
    }

    @RequestMapping("updateBook")
    public String updateBook(Book book) {
        bookService.updateBook(book);
        return "redirect:/book/allBook";
    }
    //查询所有书籍
    @RequestMapping("/allBook")
    public String list(Model model) {
        List<Book> bookList = bookService.queryAllBook();
        model.addAttribute("book",bookList);

        return "allBook";
    }

    //根据书名查找书籍
    @RequestMapping("/queryBook")
    public String queryBookByName(String bookName, Model model) {
        List<Book> bookList = bookService.queryBookByName(bookName);
        model.addAttribute("book",bookList);
        System.out.println(bookList);
        return "allBook";
    }

}
