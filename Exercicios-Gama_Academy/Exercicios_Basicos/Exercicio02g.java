/*VOLUME CUBO*/

import java.util.Scanner;
public class Exercicio02g {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double lado, volume;

        //entrada
        System.out.println("Calculando volume do cubo. ");
        System.out.print("Digite o tamanho do lado em cm: ");
        lado = teclado.nextDouble();

        //processamento
        volume = lado*lado*lado;

        //saida (formatada)
        System.out.printf("O valor do volume e de %.2f cm³ \n", volume);

        teclado.close();
    }
}
