package com.vd5.middleware.repository;

import com.vd5.middleware.entity.Device;
import com.vd5.middleware.entity.id.DeviceID;
import org.springframework.data.repository.CrudRepository;

/**
 * @author beou on 8/25/17 18:41
 * @version 1.0
 */
public interface DeviceRepository extends CrudRepository<Device, DeviceID> {
}
