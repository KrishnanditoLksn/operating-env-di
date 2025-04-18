package com.ditsdev.environment_simulation.controllers;

import com.ditsdev.environment_simulation.services.env.EnvironmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class DevelopmentSimulationController {


    private final EnvironmentService developmentSimulationImplementation;

    @Autowired
    public DevelopmentSimulationController(@Qualifier("envService") EnvironmentService developmentSimulationImplementation) {
        this.developmentSimulationImplementation = developmentSimulationImplementation;
    }

    public String getDevelopmentEnvironment() {
        return developmentSimulationImplementation.getCurrentEnvironment();
    }

    public boolean ensureEnvironmentsUp() {
        return developmentSimulationImplementation.ensureEnvironmentsUp();
    }
}
