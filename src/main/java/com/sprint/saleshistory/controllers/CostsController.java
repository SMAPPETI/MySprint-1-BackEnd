package com.sprint.saleshistory.controllers;

import com.sprint.saleshistory.dao.entities.Costs;
import com.sprint.saleshistory.service.CostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/costs")
public class CostsController {

    private final CostsService costsService;

    @Autowired
    public CostsController(CostsService costsService) {
        this.costsService = costsService;
    }

    @PostMapping
    public ResponseEntity<Costs> saveCosts(@RequestBody Costs costs) {
        Costs savedCosts = costsService.saveCosts(costs);
        return new ResponseEntity<>(savedCosts, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Costs>> getAllCosts() {
        List<Costs> costsList = costsService.getAllCosts();
        return new ResponseEntity<>(costsList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Costs> getCostsById(@PathVariable("id") int id) {
        Costs costs = costsService.getCostsById(id);
        if (costs != null) {
            return new ResponseEntity<>(costs, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCosts(@PathVariable("id") int id) {
        costsService.deleteCosts(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
