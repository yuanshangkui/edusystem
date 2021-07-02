package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author: yuansk
 * @date: 2021/7/1 / 19:52
 * @description:
 */
@Controller("/test")
public class Test {

    @GetMapping()
    public String tes1() {
        return "hello";
    }

}
