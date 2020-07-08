package com.wang.service;

import com.wang.pojo.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookService {
    //添加一本书籍
    int addBook(Book book);
    //删除一本书籍
    int deleteBookById(int id);
    //修改一本书籍
    int updateBook(Book book);
    //查询一本书籍
    Book queryBookById(int id);
    //查询多本书籍
    List<Book> queryAllBook();

    List<Book> queryBookByName(String bookName);
}
