package com.cleverit.springboottest.entitiy;

import com.cleverit.springboottest.SpringboottestApplicationTests;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
public class EntityLicenseTest extends SpringboottestApplicationTests {
    @Test
    public void testEntity(){
        EntityLicense n = new EntityLicense();
        n.setId("4erteg");
        n.setColor("rojo");
        n.setPatente("bjzh46");
        n.setTipoAuto("sedan");
        Assert.notNull(n.getColor(),"rojo");
        Assert.notNull(n.getId(),"4erteg");
        Assert.notNull(n.getPatente(),"bjzh46");
        Assert.notNull(n.getTipoAuto(),"sedan");

    }



}