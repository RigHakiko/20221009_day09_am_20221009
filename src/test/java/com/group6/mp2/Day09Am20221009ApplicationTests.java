package com.group6.mp2;

import com.group6.mp2.service.IBookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Day09Am20221009ApplicationTests {

    @Autowired
    private IBookService bookService;

    @Test
    void contextLoads() {
    }

    @Test
    void testBuy20221009() {

        bookService.buy("tom", 1);
    }
}
