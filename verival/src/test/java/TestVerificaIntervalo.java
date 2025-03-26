import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.exerc.VerificaIntervalo;

public class TestVerificaIntervalo {

    @Test
    @DisplayName("25.01 == Intervalo(25,50]")
    void checkInterval() {
        VerificaIntervalo vi = new VerificaIntervalo();

        assertEquals(vi.verificaIntervalo(25.01), "Intervalo (25,50]");
        assertEquals(vi.verificaIntervalo(25.00), "Intervalo [0,25]");
        assertEquals(vi.verificaIntervalo(100.00), "Intervalo (75,100]");
        assertEquals(vi.verificaIntervalo(-25.02), "Fora de Intervalo");
    }
}
