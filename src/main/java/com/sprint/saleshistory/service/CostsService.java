package com.sprint.saleshistory.service;

import com.sprint.saleshistory.dao.entities.Costs;

import java.util.List;

public interface CostsService {

    Costs saveCosts(Costs costs);

    List<Costs> getAllCosts();

    Costs getCostsById(int id);

    void deleteCosts(int id);
}
