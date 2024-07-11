package com.example.jjoojjeollee.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
//    @GetMapping("test")
//    public String test(Model model){
//        model.addAttribute("data", "hello!");
//        return "test";
//    }

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("test")
    public String testConnection() {
        String sql = "SELECT 'Success' FROM dual";
        return jdbcTemplate.queryForObject(sql, String.class);
    }
}
