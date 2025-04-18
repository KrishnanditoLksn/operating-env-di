package com.ditsdev.environment_simulation.services.prod;

import com.ditsdev.environment_simulation.services.env.EnvironmentService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("prodProfileService")
@Service("envService")
public class ProductionServiceImplementation implements EnvironmentService {
    @Override
    public boolean ensureEnvironmentsUp() {
        return true;
    }

    @Override
    public String getCurrentEnvironment() {
        return "Prod Environment";
    }
}
