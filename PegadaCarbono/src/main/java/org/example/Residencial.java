package org.example;

public class Residencial extends Edificio implements ICalculoPegada{

    double setTaxa() {
        return 0.20;
    }

    public double getTaxa() {
        return setTaxa();
    }

    @Override
    public double calcularPegada() {
        double pegada = getConsumo() * getTaxa();
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
