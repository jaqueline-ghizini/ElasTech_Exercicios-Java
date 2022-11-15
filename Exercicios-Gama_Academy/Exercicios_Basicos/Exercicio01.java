//Exercício 01 da lista do professor Isidro

/*
 234 -> como eu decompanho esse número?
 234 - > 2 centenas + 3 dezenas + 4 unidades

    234 / 100
     34    2 (centenas)
     |
     34 /10
      4   3 (dezenas)
      |
      4 / 1
      0   4 (unidades)

 */

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int numeroOriginal, c, d, u, resto;
        int novoNumero;

        //Entrada de dados
        System.out.println("Digite um numero inteiro de 3 digitos ");
        numeroOriginal = teclado.nextInt();

        //Processamento
        c= numeroOriginal /100; //ex: 234 /100 = 2, portanto c = 2
        resto = numeroOriginal % 100; // ex: 234 % 100 = 34, portanto resto é 34
        d = resto / 10;
        u = resto % 10;

        novoNumero = u  *100 + d * 10 + c;

        //Saida
        System.out.println("O novo numero e: "+novoNumero);

        teclado.close();
    }
}
