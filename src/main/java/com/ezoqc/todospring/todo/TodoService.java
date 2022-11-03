package com.ezoqc.todospring.todo;

public interface TodoService {
	Iterable<Todo> findById(Long id);
    Iterable<Todo> findAll();
    Todo save(Todo todo);
    void delete(Long id);
    Iterable<Todo> findAllDone();
    Iterable<Todo> findAllInProgress();
    Iterable<Todo> searchNotDoneByDescription(String keyword);
    Todo update(Todo todo);
}
