/*CALCULANDO AREA DO RETANGULO*/

import java.util.Scanner;
public class Exercicio02b {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double base, altura, area;

        //entrada
        System.out.print("Digite o tamanho da base do retangulo em cm: ");
        base = teclado.nextDouble();
        System.out.print("Digite o tamanho da altura do retangulo em cm: ");
        altura = teclado.nextDouble();

        //processamento
        area = base * altura;

        //saida (formatada)
        System.out.printf("O valor da area e de %.2f cm² \n", area);

        teclado.close();
    }
}
