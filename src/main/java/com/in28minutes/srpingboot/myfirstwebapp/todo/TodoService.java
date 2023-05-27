package com.in28minutes.srpingboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

/**
 * The todos service.
 *
 * @author architecture - raulp
 * @since Java 1.17
 * @version 27 May 2023 - 19:58:39
 *
 */
@Service
public class TodoService {

    private static final String IN28MINUTES = "in28minutes";

    private static List<Todo> todos;

    static {
        todos = new ArrayList<>();
        todos.add(new Todo(1, IN28MINUTES, "Learn AWS", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(1, IN28MINUTES, "Learn DevOps", LocalDate.now().plusYears(2), false));
        todos.add(new Todo(1, IN28MINUTES, "Learn Full Stack Development", LocalDate.now().plusYears(3), false));
    }

    public List<Todo> findByUsername(final String username) {
        return todos;
    }

}