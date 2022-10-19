/*CALCULANDO AREA DO LOSANGO*/

import java.util.Scanner;
public class Exercicio02d {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double diagonal1, diagonal2, area;

        //entrada
        System.out.print("Digite o tamanho de um lado diagonal do losango em cm: ");
        diagonal1 = teclado.nextDouble();
        System.out.print("Digite o tamanho do outro lado diagonal do losango em cm: ");
        diagonal2 = teclado.nextDouble();

        //processamento
        area = diagonal1 * diagonal2;

        //saida (formatada)
        System.out.printf("O valor da area e de %.2f cm² \n", area);

        teclado.close();
    }
}
