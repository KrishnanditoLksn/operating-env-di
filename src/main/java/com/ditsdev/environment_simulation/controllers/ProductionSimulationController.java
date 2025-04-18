package com.ditsdev.environment_simulation.controllers;

import com.ditsdev.environment_simulation.services.env.EnvironmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ProductionSimulationController {

    private final EnvironmentService environmentService;

    @Autowired
    public ProductionSimulationController(@Qualifier("envService") EnvironmentService environmentService) {
        this.environmentService = environmentService;
    }

    protected boolean ensureProdEnvIsUp() {
        return environmentService.ensureEnvironmentsUp();
    }

    protected String getProductionEnvironment() {
        return environmentService.getCurrentEnvironment();
    }
}
