package com.vd5.middleware.service;

import com.vd5.middleware.repository.EventDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author beou on 8/25/17 18:43
 * @version 1.0
 */
@Service
public class EventDataService {
    private final EventDataRepository eventDataRepository;

    @Autowired
    public EventDataService(EventDataRepository eventDataRepository) {
        this.eventDataRepository = eventDataRepository;
    }
}
