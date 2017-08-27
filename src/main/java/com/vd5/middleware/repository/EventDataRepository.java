package com.vd5.middleware.repository;

import com.vd5.middleware.entity.EventData;
import com.vd5.middleware.entity.id.EventDataID;
import org.springframework.data.repository.CrudRepository;

/**
 * @author beou on 8/25/17 18:42
 * @version 1.0
 */
public interface EventDataRepository extends CrudRepository<EventData, EventDataID> {
}
