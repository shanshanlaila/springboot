package com.example.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.controller.utils.R;
import com.example.domain.Book;
import com.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;


    @GetMapping
    public R getAll() {
        return new R(true, bookService.list());
    }


    @PostMapping
    public R save(@RequestBody Book book) {
        boolean flag = bookService.save(book);
        return new R(flag, flag ? "保存成功^_^" : "保存失败-_-!");
    }

    @DeleteMapping("/{id}")
    public R delete(@PathVariable(value = "id") Integer id) {
        boolean flag = bookService.removeById(id);
        return new R(flag, flag ? "删除成功" : "删除失败");
    }


    @PutMapping
    public R update(@RequestBody Book book) {
        boolean flag = bookService.updateById(book);
        return new R(flag, flag ? "修改成功^_^" : "修改失败-_-!");
    }

    @GetMapping("/{id}")
    public R getOne(@PathVariable Integer id) {
        return new R(true, bookService.getById(id));
    }


    @GetMapping("/{currentPage}/{pageSize}")
    public R getPage(@PathVariable int currentPage, @PathVariable int pageSize,Book book) {
        IPage<Book> page = bookService.getPage(currentPage, pageSize,book);
        if (currentPage > page.getPages()) {
            page = bookService.getPage((int) page.getPages(), pageSize,book);
        }
        return new R(true, page);
    }


}
