package com.stupidchen.blog.controller;

import com.stupidchen.blog.model.Response;
import com.stupidchen.blog.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mike on 2/28/18.
 */

@RestController
public class UserController {
    @RequestMapping(name = "/user", method = RequestMethod.POST)
    public Response postUser(User user) {
        return null;
    }

    @RequestMapping(name = "/userLogin", method = RequestMethod.POST)
    public Response postUserLogin(User user) {
        return null;
    }

    @RequestMapping(name = "/userLogout", method = RequestMethod.POST)
    public Response postUserLogin(String username) {
        return null;
    }

    @RequestMapping(name = "/user", method = RequestMethod.GET)
    public Response getUserByName(String username) {
        return null;
    }

    @RequestMapping(name = "/user", method = RequestMethod.PUT)
    public Response getUserByName(String username, User user) {
        return null;
    }

    @RequestMapping(name = "/user", method = RequestMethod.DELETE)
    public Response deleteUserByName(String username) {
        return null;
    }
}
