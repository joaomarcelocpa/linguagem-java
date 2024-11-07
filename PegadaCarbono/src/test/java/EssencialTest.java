import org.example.Essencial;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EssencialTest {

    private Essencial essencial1;
    private Essencial essencial2;

    @BeforeEach
    void setUp() {
        essencial1 = new Essencial();
        essencial1.setConsumo(2000); // Define um consumo para o primeiro objeto

        essencial2 = new Essencial();
        essencial2.setConsumo(1500); // Define um consumo menor para o segundo objeto
    }

    @Test
    void testCalcularPegada() {
        double taxa = 0.35; // Taxa esperada
        double pegadaEsperada = 2000 * taxa;

        // Testa o retorno de getTaxa()
        assertEquals(taxa, essencial1.getTaxa(), "A taxa retornada por getTaxa() está incorreta.");

        // Testa o cálculo da pegada
        assertEquals(pegadaEsperada, essencial1.calcularPegada(), 0.01,
                "A pegada de carbono calculada não corresponde ao valor esperado.");
    }

    @Test
    void testCompararMaiorPegada() {
        // Primeiro, verifica o cálculo da pegada individual para diagnóstico
        double pegadaEssencial1 = essencial1.calcularPegada();
        double pegadaEssencial2 = essencial2.calcularPegada();

        System.out.println("Pegada de essencial1: " + pegadaEssencial1);
        System.out.println("Pegada de essencial2: " + pegadaEssencial2);

        // Verifica se essencial1 tem uma pegada maior que essencial2
        assertTrue(essencial1.compararMaiorPegada(essencial2),
                "essencial1 deveria ter uma pegada maior que essencial2.");

        // Verifica se essencial2 tem uma pegada menor que essencial1
        assertFalse(essencial2.compararMaiorPegada(essencial1),
                "essencial2 deveria ter uma pegada menor que essencial1.");
    }
}
