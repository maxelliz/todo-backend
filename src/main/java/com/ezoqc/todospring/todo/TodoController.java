package com.ezoqc.todospring.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/todo")
public class TodoController {
    @Autowired private TodoService todoService;

    @GetMapping("/byId")
    public Iterable<Todo> findById(@RequestParam Long id) {
        return this.todoService.findById(id);
    }

    @GetMapping("/all")
    public Iterable<Todo> findAll() {
        return this.todoService.findAll();
    }

    @GetMapping("/search")
    public Iterable<Todo> search(@RequestParam String keyword) {
        return this.todoService.searchNotDoneByDescription(keyword);
    }

    @GetMapping("/done")
    public Iterable<Todo> findAllDone() {
        return this.todoService.findAllDone();
    }

    @GetMapping("/inProgress")
    public Iterable<Todo> findAllInProgress() {
        return this.todoService.findAllInProgress();
    }

    @PostMapping
    public Todo save(@RequestBody Todo todo) {
        return this.todoService.save(todo);
    }

    @DeleteMapping
    public void delete(@RequestParam Long id) {
        this.todoService.delete(id);
    }
    
    @PutMapping
    public Todo update(@RequestBody Todo todo) {
        return this.todoService.update(todo);
    }
}
