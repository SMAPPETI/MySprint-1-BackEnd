package com.sprint.saleshistory.dao;

import com.sprint.saleshistory.dao.entities.TimesEntity;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TimesEntityRepository extends JpaRepository<TimesEntity, Date> {
	
}
