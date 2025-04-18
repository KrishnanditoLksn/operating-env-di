package com.ditsdev.environment_simulation.services.dev;

import com.ditsdev.environment_simulation.services.env.EnvironmentService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * If there is no active profile , the default is devProfileService
 */
@Profile({"devProfileService", "default"})
@Service("envService")
public class DevelopmentSimulationImplementation implements EnvironmentService {
    @Override
    public boolean ensureEnvironmentsUp() {
        return true;
    }

    @Override
    public String getCurrentEnvironment() {
        return "Dev Environment";
    }
}
