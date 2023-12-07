package com.sprint.saleshistory.dao;

import com.sprint.saleshistory.dao.entities.Costs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CostsRepository extends JpaRepository<Costs, Integer> {

}
