/*CALCULANDO AREA DO TRIANGULO*/

import java.util.Scanner;
public class Exercicio02c {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double base, altura, area;

        //entrada
        System.out.print("Digite o tamanho da base do triangulo em cm: ");
        base = teclado.nextDouble();
        System.out.print("Digite o tamanho da altura do triangulo em cm: ");
        altura = teclado.nextDouble();

        //processamento
        area = (base * altura)/2;

        //saida (formatada)
        System.out.printf("O valor da area e de %.2f cm² \n", area);

        teclado.close();
    }
}
