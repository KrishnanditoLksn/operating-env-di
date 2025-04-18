package com.ditsdev.environment_simulation.controllers;

import com.ditsdev.environment_simulation.services.implementation.DevelopmentSimulationImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class DevelopmentSimulationController {


    private final DevelopmentSimulationImplementation developmentSimulationImplementation;

    @Autowired
    public DevelopmentSimulationController(DevelopmentSimulationImplementation developmentSimulationImplementation) {
        this.developmentSimulationImplementation = developmentSimulationImplementation;
    }

    public String getDevelopmentEnvironment() {
        return developmentSimulationImplementation.getDevelopmentEnvironment();
    }

    public boolean ensureEnvironmentsUp() {
        return developmentSimulationImplementation.ensureEnvironmentsUp();
    }
}
