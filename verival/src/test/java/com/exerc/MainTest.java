package com.exerc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    @DisplayName("Testing verificaIntervalo()")
    void checkInterval() {
        assertEquals(Main.verificaIntervalo(25.01), "Intervalo (25,50]");
        assertEquals(Main.verificaIntervalo(25.00), "Intervalo [0,25]");
        assertEquals(Main.verificaIntervalo(100.00), "Intervalo (75,100]");
        assertEquals(Main.verificaIntervalo(-25.02), "Fora de Intervalo");
    }
}
