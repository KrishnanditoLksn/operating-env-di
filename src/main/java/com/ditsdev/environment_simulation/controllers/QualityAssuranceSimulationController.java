package com.ditsdev.environment_simulation.controllers;

import com.ditsdev.environment_simulation.services.env.EnvironmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class QualityAssuranceSimulationController {
    private final EnvironmentService qualityAssuranceServiceImplementation;


    @Autowired
    public QualityAssuranceSimulationController(@Qualifier("envService") EnvironmentService qualityAssuranceServiceImplementation) {
        this.qualityAssuranceServiceImplementation = qualityAssuranceServiceImplementation;
    }

    protected String getCurrentEnvironment() {
        return qualityAssuranceServiceImplementation.getCurrentEnvironment();
    }

    protected boolean ensureEnvironmentIsUp() {
        return qualityAssuranceServiceImplementation.ensureEnvironmentsUp();
    }
}
