package com.codeup.aughblog.controllers;

import com.codeup.aughblog.repositories.CommentRepository;
import com.codeup.aughblog.repositories.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    private UserRepository usersDao;
    private CommentRepository commentsDao;

    public UserController(UserRepository usersDao, CommentRepository commentsDao) {
        this.usersDao = usersDao;
        this.commentsDao = commentsDao;
    }

    @GetMapping("/register")
    public String showRegister(Model model) {
        return "user/register";
    }
}
