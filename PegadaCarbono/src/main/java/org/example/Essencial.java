package org.example;

public class Essencial extends Edificio implements ICalculoPegada{

    double setTaxa() {
        return 0.35;
    }
   public double getTaxa() {
        return setTaxa();
    }

    @Override
    public double calcularPegada() {
        double pegada = getConsumo()* getTaxa();
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
