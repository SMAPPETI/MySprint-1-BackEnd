package com.sprint.saleshistory.controllers;

import com.sprint.saleshistory.dao.entities.TimesEntity;
import com.sprint.saleshistory.service.TimesEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("api/v1/times")
public class TimesEntityController {

    private final TimesEntityService timesEntityService;

    @Autowired
    public TimesEntityController(TimesEntityService timesEntityService) {
        this.timesEntityService = timesEntityService;
    }

    @PostMapping("/add")
    public ResponseEntity<TimesEntity> saveTimesEntity(@RequestBody TimesEntity timesEntity) {
        TimesEntity savedEntity = timesEntityService.saveTimesEntity(timesEntity);
        return new ResponseEntity<>(savedEntity, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<TimesEntity>> getAllTimesEntities() {
        List<TimesEntity> timesEntities = timesEntityService.getAllTimesEntities();
        return new ResponseEntity<>(timesEntities, HttpStatus.OK);
    }
//
//    @GetMapping("/api/v1/sales/sold/categorywise/year")
//    public ResponseEntity<List<CategoryAmount>> getSumOfAmountSoldByCategoryForYear(@RequestParam("year") int year) {
//        // Implement the logic to calculate the sum of amount sold for sales records by categories for the year
//        List<CategoryAmount> categoryAmounts = saleService.getSumOfAmountSoldByCategoryForYear(year);
//        return new ResponseEntity<>(categoryAmounts, HttpStatus.OK);
//    }

    
//    @GetMapping("/api/v1/sales/qtys/categorywise/year")
//    public ResponseEntity<List<CategoryQty>> getTotalQuantitiesByCategoryForYear(@RequestParam("year") int year) {
//        // Implement the logic to count total quantities for sales records by categories for the year
//        List<CategoryQty> categoryQtys = saleService.getTotalQuantitiesByCategoryForYear(year);
//        return new ResponseEntity<>(categoryQtys, HttpStatus.OK);
//    }

    
//    @GetMapping("/api/v1/sales")
//    public ResponseEntity<List<Sale>> getSalesByDate(@RequestParam("date") String date) {
//        // Implement the logic to fetch sales records by date
//        List<Sale> sales = saleService.getSalesByDate(date);
//        return new ResponseEntity<>(sales, HttpStatus.OK);
//    }
    
    
    
//    @GetMapping("/api/v1/sales")
//    public ResponseEntity<List<Sale>> getSalesByQuarter(@RequestParam("quarter") String quarter) {
//        // Implement the logic to fetch sales records for the given quarter
//        List<Sale> sales = saleService.getSalesByQuarter(quarter);
//        return new ResponseEntity<>(sales, HttpStatus.OK);
//    }


    
    @GetMapping("/{id}")
    public ResponseEntity<TimesEntity> getTimesEntityById(@PathVariable("id") Date id) {
        TimesEntity timesEntity = timesEntityService.getTimesEntityById(id);
        if (timesEntity != null) {
            return new ResponseEntity<>(timesEntity, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTimesEntity(@PathVariable("id") Date id) {
        timesEntityService.deleteTimesEntity(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
