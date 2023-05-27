package com.in28minutes.srpingboot.myfirstwebapp.todo;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The model class.
 *
 * @author architecture - raulp
 * @since Java 1.17
 * @version 27 May 2023 - 19:51:40
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Todo {

    private int id;
    private String username;
    private String description;
    private LocalDate targetDate;
    private boolean done;

}
