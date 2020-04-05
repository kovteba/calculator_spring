package ua.cc.kovteba.demo.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplTest {

    private static CalculatorService calculatorService = new CalculatorServiceImpl();

    @Test
    void calculate() {
        System.out.println(calculatorService.calculate("2+2"));

    }
}