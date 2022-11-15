/*VOLUME PARALELEPIPEDO*/

import java.util.Scanner;
public class Exercicio02f {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double base, profundiade, altura, volume;

        //entrada
        System.out.println("Calculando volume do paralelepipedo. ");
        System.out.print("Digite o tamanho da base em cm: ");
        base = teclado.nextDouble();
        System.out.print("Digite o tamanho da profundidade em cm: ");
        profundiade = teclado.nextDouble();
        System.out.print("Digite o tamanho da altura em cm: ");
        altura = teclado.nextDouble();

        //processamento
        volume = base * altura * profundiade;

        //saida (formatada)
        System.out.printf("O valor do volume e de %.2f cm³ \n", volume);

        teclado.close();
    }
}
