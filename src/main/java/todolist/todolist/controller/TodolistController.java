package todolist.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class TodolistController {

    @GetMapping("/")
    public String todolist() {
        return "todolist";
    }


}
