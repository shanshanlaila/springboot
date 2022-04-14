package com.example.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.domain.Book;

public interface BookService extends IService<Book> {


    /*分页的方法*/
    IPage<Book> getPage(int currentPage, int pageSize, Book book);



    IPage<Book> getPage(int currentPage, int pageSize);


}
