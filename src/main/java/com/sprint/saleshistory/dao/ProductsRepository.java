package com.sprint.saleshistory.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sprint.saleshistory.dao.entities.ProductsEntity;

public interface ProductsRepository extends JpaRepository<ProductsEntity, Integer>{

}
