package com.spring.assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component    //Component defines this as a bean
public class Car {

    @Autowired    //this will tell the Spring that it is a dependency, which means Car depends on EngineType
    private EngineType engineType;    //interface making the code loosely coupled

    public Car(EngineType engineType) {
        super();
        this.engineType = engineType;
    }

    public String carManufacture( String engineEnquiry ) {


        String selectedEngine = engineType.getEngine(engineEnquiry);
        System.out.println("Spring: I prefer " + engineType);
        return selectedEngine;    //this is returned to String result
    }

}

