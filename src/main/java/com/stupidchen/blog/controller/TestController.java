package com.stupidchen.blog.controller;

import com.stupidchen.blog.model.TestModel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mike on 2/8/18.
 */

@RestController
public class TestController {
    @RequestMapping("/test")
    public TestModel test() {
        return new TestModel();
    }
}
