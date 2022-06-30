package com.itheima.dao;

import com.itheima.domain.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface BookDao {
    //用mybatis自动代理来帮我们创建实现
    //#{type} 中type指的是book类中的属性
    //[INFO]{dataSource-1} inited 这个问题的原因是SQL语句写错了 少写了一个右括号
    //@Insert("insert into book values(null,#{type},#{name},#{description})")
    @Insert("insert into book (type,name,description) values(#{type},#{name},#{description})")
    public int save(Book book);

    @Update("update book set type=#{type},name=#{name},description=#{description} where id=#{id}")
    public int update(Book book);

    @Delete("delete from book where id=#{id}")
    public int delete(Integer id);

    @Select("select * from book where id=#{id}")
    public Book getById(Integer id);

    @Select("select * from book")
    public List<Book> getAll();
}
