package com.cleverit.springboottest;

import com.cleverit.springboottest.entitiy.EntityLicense;
import org.springframework.data.repository.CrudRepository;


public interface EntityLicenseRepository extends CrudRepository<EntityLicense, Integer> {
}
