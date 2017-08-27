package com.vd5.middleware.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.vd5.middleware.entity.Account;

/**
 * @author beou on 8/25/17 18:30
 * @version 1.0
 */
@Repository
public interface AccountRepository extends CrudRepository<Account, String> {
}
