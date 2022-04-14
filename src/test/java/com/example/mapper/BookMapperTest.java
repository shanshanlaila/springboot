package com.example.mapper;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookMapperTest {

    @Autowired
    private BookMapper bookMapper;
    @Test
    void testSelect(){
        System.out.println(bookMapper.selectById(1));
    }


    @Test
    void testInsert(){
        Book book = new Book();
        book.setAuthor("詹姆斯");
        book.setName("《未来简史》");
        book.setType("文学");
        bookMapper.insert(book);
    }


    @Test
    void testPage(){
        LambdaQueryWrapper<Book> wrapper = new LambdaQueryWrapper<>();
        wrapper.like(Book::getName,"活");
        bookMapper.selectList(wrapper);

    }
}
