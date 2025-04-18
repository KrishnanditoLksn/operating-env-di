package com.ditsdev.environment_simulation.services.dev;

import com.ditsdev.environment_simulation.services.env.EnvironmentService;
import org.springframework.stereotype.Service;

@Service
public interface DevelopmentSimulationService extends EnvironmentService {
    String getDevelopmentEnvironment();
}
