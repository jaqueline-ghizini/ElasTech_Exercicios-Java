/*CALCULANDO VOLUME CILINDRO*/

import java.util.Scanner;
public class Exercicio02h {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double raio, altura, volume;

        //entrada
        System.out.print("Digite o raio do cilindro: ");
        raio = teclado.nextDouble();
        System.out.print("Digite a altura do cilindro: ");
        altura = teclado.nextDouble();

        //processamento
        volume = 3.14 * raio *raio *altura;

        //saida (formatada)
        System.out.printf("O volume do cilindro vale %.2f cm³ \n", volume);
        
        teclado.close();
    }
}
