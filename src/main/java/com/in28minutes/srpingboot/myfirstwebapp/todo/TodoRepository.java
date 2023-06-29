package com.in28minutes.srpingboot.myfirstwebapp.todo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * The Todos repository.
 *
 * @author architecture - raulp
 * @since Java 1.17
 * @version 29 Jun 2023 - 19:45:48
 *
 */
public interface TodoRepository extends JpaRepository<Todo, Integer> {

    public List<Todo> findByUsername(String username);

}
