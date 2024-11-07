package org.example;

import java.util.ArrayList;
import java.util.List;

public class CarbonAnalyzer {

    private List<ICalculoPegada> listaCalculoPegada = new ArrayList<>();

    public double calcularEmissaoTotal(){
        double somaTotal = 0;
        for (ICalculoPegada calculoPegada : listaCalculoPegada){
            somaTotal += calculoPegada.calcularPegada();
        }
        return somaTotal;
    }

    public void adicionarElemento (ICalculoPegada calculoPegada){
        listaCalculoPegada.add(calculoPegada);
    }
}
