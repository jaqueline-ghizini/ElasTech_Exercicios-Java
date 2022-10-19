/*CALCULANDO AREA DO QUADRADO*/

import java.util.Scanner;
public class Exercicio02a {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double lado, area;

        //entrada
        System.out.print("Digite o tamanho do lado do quadrado em cm: ");
        lado = teclado.nextDouble();

        //processamento
        area = lado * lado;

        //saida (formatada)
        System.out.printf("O valor da area e de %.2f cm² \n", area);

        teclado.close();
    }
}
