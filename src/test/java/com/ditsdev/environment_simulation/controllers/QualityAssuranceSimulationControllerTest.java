package com.ditsdev.environment_simulation.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

/**
 * Every annotated profile must use active profile in test class
 */

//@ActiveProfiles("qaProfileService")
@SpringBootTest
class QualityAssuranceSimulationControllerTest {
    @Autowired
    private QualityAssuranceSimulationController qualityAssuranceSimulationController;

    @Test
    void getCurrentEnvironment() {
        System.out.println(qualityAssuranceSimulationController.getCurrentEnvironment());
    }

    @Test
    void ensureQaEnvIsUp() {
        System.out.println(qualityAssuranceSimulationController.ensureEnvironmentIsUp());
    }
}