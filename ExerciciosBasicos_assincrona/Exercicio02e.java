/*CALCULANDO AREA DO TRAPEZIO*/

import java.util.Scanner;
public class Exercicio02e {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double baseMaior, baseMenor, altura, area;

        //entrada
        System.out.println("Calculando area do trapezio. ");
        System.out.print("Digite o tamanho da base maior em cm: ");
        baseMaior = teclado.nextDouble();
        System.out.print("Digite o tamanho da base menor em cm: ");
        baseMenor = teclado.nextDouble();
        System.out.print("Digite o tamanho da altura em cm: ");
        altura = teclado.nextDouble();

        //processamento
        area = ((baseMaior + baseMenor) * altura)/2;

        //saida (formatada)
        System.out.printf("O valor da area e de %.2f cm² \n", area);

        teclado.close();
    }
}
