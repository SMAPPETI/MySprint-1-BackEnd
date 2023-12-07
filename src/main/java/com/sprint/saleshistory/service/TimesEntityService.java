package com.sprint.saleshistory.service;

import com.sprint.saleshistory.dao.entities.TimesEntity;
import com.sprint.saleshistory.models.TimesPojo;

import java.util.Date;
import java.util.List;

public interface TimesEntityService {

    TimesEntity saveTimesEntity(TimesEntity timesEntity);

    List<TimesEntity> getAllTimesEntities();

    TimesEntity getTimesEntityById(Date time_id);

    void deleteTimesEntity(Date time_id);
}



