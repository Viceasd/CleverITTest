package com.cleverit.springboottest.dao;

import com.cleverit.springboottest.EntityLicenseRepository;
import com.cleverit.springboottest.entitiy.EntityLicense;
import com.cleverit.springboottest.model.LicensePlate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LicensePlateDaoImpl {


    @Autowired
    private EntityLicenseRepository licenseRepository;

    public LicensePlate create(final LicensePlate car){
        EntityLicense n = new EntityLicense();
        n.setId(car.getId());
        n.setColor(car.getColor());
        n.setPatente(car.getPatente());
        n.setTipoAuto(car.getTipoAuto());
        licenseRepository.save(n);
        return car;
    }
}
