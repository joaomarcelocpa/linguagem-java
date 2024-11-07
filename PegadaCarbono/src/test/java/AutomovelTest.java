import org.example.Automovel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AutomovelTest {

    private Automovel automovel1;
    private Automovel automovel2;

    @BeforeEach
    void setUp() {
        automovel1 = new Automovel();
        automovel1.setDistancia(500); // Exemplo de distância
        automovel1.setEficiencia(15);  // Exemplo de eficiência

        automovel2 = new Automovel();
        automovel2.setDistancia(300); // Exemplo de distância
        automovel2.setEficiencia(10);  // Exemplo de eficiência
    }

    @Test
    void testCalcularPegada() {
        double pegadaEsperada = (500 / 15.0) * 10;
        assertEquals(pegadaEsperada, automovel1.calcularPegada(), 0.01, "A pegada de carbono calculada está incorreta.");
    }

    @Test
    void testCompararMaiorPegada() {

        assertTrue(automovel1.compararMaiorPegada(automovel2), "automovel1 não deveria ter uma pegada maior.");

        assertFalse(automovel2.compararMaiorPegada(automovel1), "automovel2 deveria ter uma pegada maior.");
    }
}
