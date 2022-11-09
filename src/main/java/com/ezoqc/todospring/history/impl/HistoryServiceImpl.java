package com.ezoqc.todospring.history.impl;

import com.ezoqc.todospring.history.History;
import com.ezoqc.todospring.history.HistoryRepository;
import com.ezoqc.todospring.history.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HistoryServiceImpl implements HistoryService {
    @Autowired
    private HistoryRepository historyRepository;

    @Override
    public Iterable<History> findAll() {
        return this.historyRepository.findAll();
    }
    
    @Override
    public History save(History history) {
        return this.historyRepository.save(history);
    }
}
