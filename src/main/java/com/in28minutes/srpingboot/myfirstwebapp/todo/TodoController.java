package com.in28minutes.srpingboot.myfirstwebapp.todo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * The task controller class.
 *
 * @author architecture - raulp
 * @since Java 1.17
 * @version 28 May 2023 - 12:06:20
 *
 */
@Controller
public class TodoController {

    private TodoService todoService;

    public TodoController(TodoService todoService) {
        super();
        this.todoService = todoService;
    }

    @RequestMapping("list-todos")
    public String listAllTodos(ModelMap model) {
        List<Todo> todos = todoService.findByUsername("in28minutes");
        model.put("todos", todos);

        return "listTodos";
    }
}
