package org.example;

public class Automovel extends Veiculo implements ICalculoPegada{

    @Override
    public double calcularPegada() {
        double pegada = (getDistancia() / getEficiencia() * 10);
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
