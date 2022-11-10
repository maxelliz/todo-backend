package com.ezoqc.todospring.todo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Todo {
    @Id
    private Long id;
    private String description;
    private boolean done;
    private Date targetDate;

    protected Todo() {}

    public Todo(String description, boolean done, Date targetDate) {
        this.description = description;
        this.done = done;
        this.targetDate = targetDate;
    }

    @Override
    public String toString() {
        return String.format(
                "Todo [id=%d, description='%s', done=%b]",
                this.id, this.description, this.done);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

	public Date getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(Date targetDate) {
		this.targetDate = targetDate;
	}
}
