package com.cleverit.springboottest.controller;

import com.cleverit.springboottest.EntityLicenseRepository;
import com.cleverit.springboottest.dao.LicensePlateDaoImpl;
import com.cleverit.springboottest.entitiy.EntityLicense;
import com.cleverit.springboottest.model.LicensePlate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import java.util.List;

@RestController
@RequestMapping("/test")
public class ControllerUserClient {

    private static final Logger log = LoggerFactory.getLogger(ControllerUserClient.class);

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LicensePlateDaoImpl licensePlateDao;

    // La base de datos utilizada es MYSQL
    @GetMapping(path = "/insert", produces = MediaType.APPLICATION_JSON_VALUE)
    public  @ResponseBody List<LicensePlate> getLicencePlates(){
        ResponseEntity<List<LicensePlate>> licenseResponse =
                restTemplate.exchange("https://arsene.azurewebsites.net/LicensePlate",
                        HttpMethod.GET,null, new ParameterizedTypeReference<List<LicensePlate>>() {
                        });
        List<LicensePlate> listLicenses = licenseResponse.getBody();
        listLicenses.forEach((final LicensePlate licensePlate) -> licensePlateDao.create(licensePlate));
        return listLicenses;
    }




}
