package com.rest.webservices.restfulwebservices.todo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TodoHardCodedService {

    private static List<Todo> todos;
    private static int idCounter;

    static {
        idCounter = 0;
        todos = new ArrayList<>();

        todos.add(new Todo(++idCounter, "anii", "Learn about React", new Date(), false));
        todos.add(new Todo(++idCounter, "anii", "Learn about JAVA", new Date(), false));
        todos.add(new Todo(++idCounter, "anii", "Learn about Spring Boot", new Date(), false));
        todos.add(new Todo(++idCounter, "anii", "Learn about Microservices", new Date(), false));
    }

    public List<Todo> findAll () {
        return todos;
    }

    public Todo save (Todo todo) {

        if (todo.getId () == -1 || todo.getId () == 0) {
            todo.setId (++idCounter);
            todos.add (todo);
        }
        else {
            deleteById (todo.getId ());
            todos.add (todo);
        }

        return todo;
    }

    public Todo deleteById (long id) {

        Todo todo = findById (id);
        return todos.remove (todo) ? todo : null;
    }

    public Todo findById (long id) {

        for (Todo todo : todos) {
            if (id == todo.getId ()) {
                return todo;
            }
        }

        return null;
    }
}
