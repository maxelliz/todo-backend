package com.ezoqc.todospring.history;

public interface HistoryService {
    Iterable<History> findAll();
    History save(History history);
}
