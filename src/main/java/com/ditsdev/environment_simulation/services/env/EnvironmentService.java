package com.ditsdev.environment_simulation.services.env;

import org.springframework.stereotype.Service;

@Service
public interface EnvironmentService {
    boolean ensureEnvironmentsUp();
}
