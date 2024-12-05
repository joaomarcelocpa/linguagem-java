import java.util.Scanner;

public class teste {

    public static double function (double x) {

        return 2 * Math.sqrt(16 - Math.pow(x,  2));
    }

    public static double somaRiemann (double a, double b, int n) {

        double deltaX = (b-a) / n;
        double soma = 0.0;

        for (int i=0; i<=n; i++) {

            double x = a + i * deltaX;
            soma = soma + function(x) * deltaX;
        }
        return soma;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double limiteInferior = -4;
        double limiteSuperior = 4;

        System.out.println("Entre com o valor de n:");
        int n = sc.nextInt();

        double resultado = somaRiemann(limiteInferior, limiteSuperior, n);

        System.out.println("O resultado da integral =  " + resultado);

        sc.close();
    }
}