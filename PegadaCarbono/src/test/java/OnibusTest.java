import org.example.Onibus;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OnibusTest {

    private Onibus onibus1;
    private Onibus onibus2;

    @BeforeEach
    void setUp() {
        onibus1 = new Onibus();
        onibus1.setDistancia(100);
        onibus1.setEficiencia(5);
        onibus1.setNumeroViagens(10);

        onibus2 = new Onibus();
        onibus2.setDistancia(150);
        onibus2.setEficiencia(8);
        onibus2.setNumeroViagens(5);
    }

    @Test
    void testCalcularPegada() {
        double pegadaEsperada = ((100 * 10 * 25) / 5.0) * 10;
        assertEquals(pegadaEsperada, onibus1.calcularPegada(), 0.01, "A pegada de carbono calculada está incorreta.");
    }

    @Test
    void testCompararMaiorPegada() {

        assertTrue(onibus1.compararMaiorPegada(onibus2), "onibus1 deveria ter uma pegada maior.");

        assertFalse(onibus2.compararMaiorPegada(onibus1), "onibus2 não deveria ter uma pegada maior.");
    }
}
