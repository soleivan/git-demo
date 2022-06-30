package com.itheima.domain;

public class Book {
    private Integer id;
    private String type;
    private String name;
    private String description;

    //写了有参构造器 不写无参构造器 会导致浏览器发出请求添加book数据时无法创建book对象导致错误

    public Book() {
    }

    public Book(Integer id, String type, String name, String description) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
