package com.ezoqc.todospring.todo.impl;

import com.ezoqc.todospring.todo.Todo;
import com.ezoqc.todospring.todo.TodoRepository;
import com.ezoqc.todospring.todo.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TodoServiceImpl implements TodoService {
    @Autowired
    private TodoRepository todoRepository;

    @Override
    public Iterable<Todo> findById(Long id) {
    	ArrayList<Todo> resultat = new ArrayList<Todo>();
    	if(this.todoRepository.findById(id).isPresent()) {
        	resultat.add(this.todoRepository.findById(id).get());
    	}
        return resultat;
    }

    @Override
    public Iterable<Todo> findAll() {
        return this.todoRepository.findAll();
    }

    @Override
    public Todo save(Todo todo) {
        return this.todoRepository.save(todo);
    }

    @Override
    public void delete(Long id) {
        this.todoRepository.deleteById(id);
    }

    @Override
    public Iterable<Todo> findAllDone() {
        return this.todoRepository.findByDone(true);
    }

    @Override
    public Iterable<Todo> findAllInProgress() {
        return this.todoRepository.findByDone(false);
    }

    @Override
    public Iterable<Todo> searchNotDoneByDescription(String keyword) {
        return this.todoRepository.findByDescriptionContainingIgnoreCaseAndDone(keyword, false);
    }
    
    @Override
    public Todo update(Todo todo) {
    	Iterable<Todo> todoList = findById(todo.getId());
    	if(todoList.spliterator().getExactSizeIfKnown() > 0) {
    		Todo todoToSave = todoList.iterator().next();
    		todoToSave.setDescription(todo.getDescription());
    		todoToSave.setDone(todo.isDone());
            return this.todoRepository.save(todoToSave);
    	} else {
    		System.out.println("todo a mettre a jour introuvable.");
    		return null;
    	}    	
    }
}
