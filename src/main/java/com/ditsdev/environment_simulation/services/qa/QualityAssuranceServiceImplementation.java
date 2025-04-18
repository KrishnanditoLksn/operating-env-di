package com.ditsdev.environment_simulation.services.qa;

import com.ditsdev.environment_simulation.services.env.EnvironmentService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("qaProfileService")
@Service("envService")
public class QualityAssuranceServiceImplementation implements EnvironmentService {
    @Override
    public boolean ensureEnvironmentsUp() {
        return true;
    }

    @Override
    public String getCurrentEnvironment() {
        return "Qa Env Is Up !!!";
    }
}
