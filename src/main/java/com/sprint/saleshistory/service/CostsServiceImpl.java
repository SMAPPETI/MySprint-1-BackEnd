package com.sprint.saleshistory.service;

import com.sprint.saleshistory.dao.entities.Costs;
import com.sprint.saleshistory.dao.CostsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CostsServiceImpl implements CostsService {

    private final CostsRepository costsRepository;

    @Autowired
    public CostsServiceImpl(CostsRepository costsRepository) {
        this.costsRepository = costsRepository;
    }

    @Override
    public Costs saveCosts(Costs costs) {
        return costsRepository.save(costs);
    }

    @Override
    public List<Costs> getAllCosts() {
        return costsRepository.findAll();
    }

    @Override
    public Costs getCostsById(int id) {
        Optional<Costs> optionalCosts = costsRepository.findById(id);
        return optionalCosts.orElse(null);
    }

    @Override
    public void deleteCosts(int id) {
        costsRepository.deleteById(id);
    }
}
