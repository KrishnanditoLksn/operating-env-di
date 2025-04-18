package com.ditsdev.environment_simulation.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DevelopmentSimulationControllerTest {

    @Autowired
    DevelopmentSimulationController developmentSimulationController;

    @Test
    void ensureDevIsUp() {
        System.out.println(developmentSimulationController.ensureEnvironmentsUp());
    }

    @Test
    void getDevelopmentEnvTest() {
        System.out.println(developmentSimulationController.getDevelopmentEnvironment());
    }
}