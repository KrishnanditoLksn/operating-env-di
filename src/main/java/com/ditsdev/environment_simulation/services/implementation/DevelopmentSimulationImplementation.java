package com.ditsdev.environment_simulation.services.implementation;

import com.ditsdev.environment_simulation.services.dev.DevelopmentSimulationService;
import org.springframework.stereotype.Service;


@Service
public class DevelopmentSimulationImplementation implements DevelopmentSimulationService {
    @Override
    public String getDevelopmentEnvironment() {
        return "A221-Dev";
    }

    @Override
    public boolean ensureEnvironmentsUp() {
        return true;
    }
}
