package com.ezoqc.todospring.history;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/history")
public class HistoryController {
    @Autowired private HistoryService historyService;

    @GetMapping("/all")
    public Iterable<History> findAll() {
        return this.historyService.findAll();
    }
    
    @PostMapping
    public History save(@RequestBody History history) {
        return this.historyService.save(history);
    }
}
