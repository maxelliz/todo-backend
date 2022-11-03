package com.ezoqc.todospring.todo;

import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {
    Iterable<Todo> findByDone(boolean done);
    Iterable<Todo> findByDescriptionContainingIgnoreCaseAndDone(String keyword, boolean done);
}
