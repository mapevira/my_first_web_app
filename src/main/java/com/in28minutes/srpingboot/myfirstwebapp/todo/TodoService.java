package com.in28minutes.srpingboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import jakarta.validation.Valid;

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

    private static int todosCount = 0;

    static {
        todos = new ArrayList<>();
        todos.add(new Todo(++todosCount, IN28MINUTES, "Learn AWS", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(++todosCount, IN28MINUTES, "Learn DevOps", LocalDate.now().plusYears(2), false));
        todos.add(new Todo(++todosCount, IN28MINUTES, "Learn Full Stack Development", LocalDate.now().plusYears(3), false));
    }

    public List<Todo> findByUsername(final String username) {
        return todos;
    }

    public void addTodo(String username, String description, LocalDate targetDate, boolean done) {
        Todo todo = new Todo(++todosCount, username, description, targetDate, done);
        todos.add(todo);
    }

    public void deleteById(int id) {
        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        todos.removeIf(predicate);
    }

    public Todo findById(int id) {
        Predicate<? super Todo> predicate = todo -> todo.getId() == id;

        return todos.stream().filter(predicate).findFirst().get();
    }

    public void updateTodo(@Valid Todo todo) {
        deleteById(todo.getId());
        todos.add(todo);
    }
}
