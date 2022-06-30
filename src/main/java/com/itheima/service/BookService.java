package com.itheima.service;

import com.itheima.domain.Book;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface BookService {
    //业务层的接口最好能让人一眼看出来执行什么业务，下面这个写法并不规范
    //最好写一下文档注释
    /**
     * 保存
     * @param book
     * @return
     */
    public boolean save(Book book);

    public boolean update(Book book);

    public boolean delete(Integer id);

    public Book getById(Integer id);

    public List<Book> getAll();
}
