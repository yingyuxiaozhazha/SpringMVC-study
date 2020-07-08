package com.wang.dao;

import com.wang.pojo.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {
    //添加一本书籍
    int addBook(Book book);
    //删除一本书籍
    int deleteBookById(@Param("bookId") int id);
    //修改一本书籍
    int updateBook(Book book);
    //查询一本书籍
    Book queryBookById(@Param("bookId") int id);
    //查询多本书籍
    List<Book> queryAllBook();
    //根据书名查找书籍
    List<Book> queryBookByName(@Param("bookName") String bookName);
}
