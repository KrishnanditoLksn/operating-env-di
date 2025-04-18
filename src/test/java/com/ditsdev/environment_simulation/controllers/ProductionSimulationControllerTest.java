package com.ditsdev.environment_simulation.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("prodProfileService")
@SpringBootTest
class ProductionSimulationControllerTest {

    @Autowired
    ProductionSimulationController productionSimulationController;

    @Test
    void ensureProdIsUp() {
        System.out.println(productionSimulationController.ensureProdEnvIsUp());
    }

    @Test
    void getProductionEnvironment() {
        System.out.println(productionSimulationController.getProductionEnvironment());
    }
}