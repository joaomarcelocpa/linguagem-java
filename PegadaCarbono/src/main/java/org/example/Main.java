package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma opção:");
        System.out.println("1. Edificio");
        System.out.println("2. Veiculo");
        int escolha = scanner.nextInt();

        if (escolha == 1) {
            System.out.println("Escolha o tipo de edificio:");
            System.out.println("1. Residencial");
            System.out.println("2. Essencial");
            int tipoEdificio = scanner.nextInt();

            if (tipoEdificio == 1) {
                System.out.println("Digite o consumo do edificio residencial:");
                double consumo = scanner.nextDouble();

                Residencial residencial = new Residencial();
                residencial.setConsumo(consumo);
                residencial.setTaxa(residencial.setTaxa());

                System.out.println("Pegada de carbono do edificio residencial: " + residencial.calcularPegada());

            } else if (tipoEdificio == 2) {
                System.out.println("Digite o consumo do edificio essencial:");
                double consumo = scanner.nextDouble();

                Essencial essencial = new Essencial();
                essencial.setConsumo(consumo);
                essencial.setTaxa(essencial.setTaxa());

                System.out.println("Pegada de carbono do edificio essencial: " + essencial.calcularPegada());

            } else {
                System.out.println("Opção inválida.");
            }

        } else if (escolha == 2) {
            System.out.println("Escolha o tipo de veiculo:");
            System.out.println("1. Automovel");
            System.out.println("2. Onibus");
            int tipoVeiculo = scanner.nextInt();

            if (tipoVeiculo == 1) {
                System.out.println("Digite a distância percorrida pelo automóvel:");
                double distanciaAutomovel = scanner.nextDouble();
                System.out.println("Digite a eficiência do automóvel (km/l):");
                double eficienciaAutomovel = scanner.nextDouble();

                Automovel automovel = new Automovel();
                automovel.setDistancia(distanciaAutomovel);
                automovel.setEficiencia(eficienciaAutomovel);

                System.out.println("Pegada de carbono do automóvel: " + automovel.calcularPegada());

            } else if (tipoVeiculo == 2) {
                System.out.println("Digite a distância percorrida pelo ônibus em um dia:");
                double distanciaOnibus = scanner.nextDouble();
                System.out.println("Digite a eficiência do ônibus (km/l):");
                double eficienciaOnibus = scanner.nextDouble();
                System.out.println("Digite o número de viagens do ônibus:");
                int numeroViagens = scanner.nextInt();

                Onibus onibus = new Onibus();
                onibus.setDistancia(distanciaOnibus);
                onibus.setEficiencia(eficienciaOnibus);
                onibus.setNumeroViagens(numeroViagens);

                System.out.println("Pegada de carbono do ônibus: " + onibus.calcularPegada());

            } else {
                System.out.println("Opção inválida.");
            }

        } else {
            System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}