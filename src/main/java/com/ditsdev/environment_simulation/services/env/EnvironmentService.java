package com.ditsdev.environment_simulation.services.env;

public interface EnvironmentService {
    boolean ensureEnvironmentsUp();

    String getCurrentEnvironment();
}
