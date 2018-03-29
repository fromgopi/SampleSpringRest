package com.example.SimpleSpringBoot.controller;


import com.example.SimpleSpringBoot.beans.Names;
import com.example.SimpleSpringBoot.dao.MyDaoImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@org.springframework.web.bind.annotation.RestController
public class RestController {

    public static final Logger logger = LoggerFactory.getLogger(RestController.class);

    @Autowired
    private MyDaoImpl myDao;

    @RequestMapping(value = "/hello/{name}")
    public String sayHello(@PathVariable("name") String name){
        logger.info("You are currently in sayHello()....");
        String message = "Welcome " + name +"!!!...";
        return message;
    }


    @RequestMapping(value = "names/all")
    public List<Names> getAllNames(){
        logger.info("Entering into getAllNames() in the controller..");
        logger.info("");
        List<Names> namesList = null;
        try {
            namesList = myDao.getAllNames();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return namesList;
    }

    @RequestMapping(value = "/name/{firstName}", method = RequestMethod.GET)
    public List<Names> getNamesByFirst (@PathVariable("firstName") String firstName) {
        logger.info("Entering gerNamesByFirst() with firstName -> {}", firstName);
        List<Names> allNames = myDao.queryByFirstName(firstName);
        logger.info("The size of the list of names with the given first name -> {} is -> {}",firstName,allNames.size());
        return allNames;
    }

}
