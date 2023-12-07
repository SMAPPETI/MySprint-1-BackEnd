package com.sprint.saleshistory.service;

import com.sprint.saleshistory.dao.entities.TimesEntity;
import com.sprint.saleshistory.dao.TimesEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class TimesEntityServiceImpl implements TimesEntityService {

    private final TimesEntityRepository timesEntityRepository;

    @Autowired
    public TimesEntityServiceImpl(TimesEntityRepository timesEntityRepository) {
        this.timesEntityRepository = timesEntityRepository;
    }

    @Override
    public TimesEntity saveTimesEntity(TimesEntity timesEntity) {
        return timesEntityRepository.save(timesEntity);
    }

    @Override
    public List<TimesEntity> getAllTimesEntities() {
        return timesEntityRepository.findAll();
    }

    @Override
    public TimesEntity getTimesEntityById(Date date) {
        Optional<TimesEntity> optionalTimesEntity = timesEntityRepository.findById(date);
        return optionalTimesEntity.orElse(null);
    }

    @Override
    public void deleteTimesEntity(Date id) {
        timesEntityRepository.deleteById(id);
    }
}
