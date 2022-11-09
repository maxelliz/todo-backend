package com.ezoqc.todospring.history;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class History {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private Long idTodo;
    private String todoDescription;
    private String status;
    private Date date;

    protected History() {}

    public History(Long idTodo, String todoDescription, String status, Date date) {
        this.idTodo = idTodo;
        this.todoDescription = todoDescription;
        this.status = status;
        this.date = date;
    }

    @Override
    public String toString() {
        return String.format(
                "History [id=%d, idTodo='%d', todoDescription=%s, status=%s, date=%s]",
                this.id, this.idTodo, this.todoDescription, this.status, this.date);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdTodo() {
        return idTodo;
    }

    public void setIdTodo(Long idTodo) {
        this.idTodo = idTodo;
    }
    
    public String getTodoDescription() {
        return todoDescription;
    }

    public void setTodoDescription(String todoDescription) {
        this.todoDescription = todoDescription;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
