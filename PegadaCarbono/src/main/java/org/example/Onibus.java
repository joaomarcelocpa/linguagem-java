package org.example;

public class Onibus extends Veiculo implements ICalculoPegada {

    private int numeroViagens;
    private static int diasRodados = 25;

    public void setNumeroViagens(int numeroViagens) {
        this.numeroViagens = numeroViagens;
    }

    @Override
    public double calcularPegada() {
        double pegada = ((getDistancia() * numeroViagens * diasRodados) / getEficiencia()) * 10;
        return pegada;
    }

    @Override
    public boolean compararMaiorPegada(ICalculoPegada pegada) {
        boolean maior = false;

        if (calcularPegada() > pegada.calcularPegada()) {
            maior = true;
        }
        return maior;

    }
}
