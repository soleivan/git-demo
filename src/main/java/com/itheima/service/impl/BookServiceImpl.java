package com.itheima.service.impl;

import com.itheima.dao.BookDao;
import com.itheima.domain.Book;
import com.itheima.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;//报错的原因是spring没有配置BookDao的bean，因为BookDao的对象是自动代理创建的


    public boolean save(Book book) {
        return bookDao.save(book)>0;
    }

    public boolean update(Book book) {
        return bookDao.update(book)>0;
    }

    public boolean delete(Integer id) {
        return bookDao.delete(id)>0;
    }

    public Book getById(Integer id) {
        return bookDao.getById(id);
    }

    public List<Book> getAll() {
        return bookDao.getAll();
    }
}
