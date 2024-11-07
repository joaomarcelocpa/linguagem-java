import org.example.Residencial;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ResidencialTest {

    private Residencial residencial1;
    private Residencial residencial2;

    @BeforeEach
    void setUp() {
        residencial1 = new Residencial();
        residencial1.setConsumo(1000); // Exemplo de consumo

        residencial2 = new Residencial();
        residencial2.setConsumo(800);  // Exemplo de consumo
    }

    @Test
    void testCalcularPegada() {
        double pegadaEsperada = 1000 * 0.20;
        assertEquals(pegadaEsperada, residencial1.calcularPegada(), 0.01, "A pegada de carbono calculada está incorreta.");
    }

    @Test
    void testCompararMaiorPegada() {
        // residencial1 deve ter uma pegada maior do que residencial2
        assertTrue(residencial1.compararMaiorPegada(residencial2), "residencial1 deveria ter uma pegada maior.");

        // residencial2 deve ter uma pegada menor do que residencial1
        assertFalse(residencial2.compararMaiorPegada(residencial1), "residencial2 não deveria ter uma pegada maior.");
    }
}
