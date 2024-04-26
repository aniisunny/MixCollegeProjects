package com.rest.webservices.restfulwebservices.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@CrossOrigin (origins = "http://localhost:4200")
public class TodoResource {

    @Autowired
    private TodoHardCodedService todoService;

    @GetMapping ("/users/{username}/todos")
    public List<Todo> getAllTodos (@PathVariable String username) { //throws InterruptedException {
        //Thread.sleep (3000);
        return todoService.findAll ();
    }

    @GetMapping ("/users/{username}/todos/{id}")
    public Todo getTodo (@PathVariable String username, @PathVariable long id) {

        return todoService.findById (id);
    }

    @PostMapping ("/users/{username}/todos")
    public ResponseEntity<Void> todo (@PathVariable String username, @RequestBody Todo todo) {

        Todo createdTodo = todoService.save (todo);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest ().path ("/{id}").buildAndExpand (createdTodo.getId ()).toUri ();

        return ResponseEntity.created (uri).build ();
    }

    @PutMapping ("/users/{username}/todos/{id}")
    public ResponseEntity<Todo> updateTodo (@PathVariable String username, @PathVariable long id, @RequestBody Todo todo) {

        Todo updatedTodo = todoService.save (todo);
        return new ResponseEntity<Todo> (updatedTodo, HttpStatus.OK);
    }

    @DeleteMapping ("/users/{username}/todos/{id}")
    public ResponseEntity<Void> deleteTodo (@PathVariable String username, @PathVariable long id) {

        Todo todo = todoService.deleteById (id);
        if (todo == null) {
            return ResponseEntity.notFound ().build ();
        }

        return ResponseEntity.noContent ().build ();
    }
}
