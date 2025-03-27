package com.exerc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    @DisplayName("Testing verificaIntervalo()")
    void checkInterval() {
        // Beecrowd
        assertEquals("Intervalo (25,50]", Main.verificaIntervalo(25.01));
        assertEquals("Intervalo [0,25]", Main.verificaIntervalo(25.00));
        assertEquals("Intervalo (75,100]", Main.verificaIntervalo(100.00));
        assertEquals("Fora de Intervalo", Main.verificaIntervalo(-25.02));

        // Mais testes
        assertEquals("Intervalo (25,50]", Main.verificaIntervalo(50.00));    // On Point
        assertEquals("Intervalo (50,75]", Main.verificaIntervalo(50.01));    // Off Point

        assertEquals("Intervalo (50,75]", Main.verificaIntervalo(75.00));    // On Point
        assertEquals("Intervalo (75,100]", Main.verificaIntervalo(75.01));    // Off Point

        assertEquals("Fora de Intervalo", Main.verificaIntervalo(100.01));
    }
}
