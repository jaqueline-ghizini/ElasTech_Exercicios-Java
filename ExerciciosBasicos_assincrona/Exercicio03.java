/*
  100 kw = 1/7 salario minimo
  1kw = x
  x* 100 = salariominimo/7 ==> x = salariominimo / 7/ 100
 */

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double salarioMinimo, valor1kw, quantKw, valorTotal, valorComDesonto;

        //Entrada
        System.out.print("Digite o valor do salario Minimo(com ,): ");
        salarioMinimo = teclado.nextDouble();
        System.out.print("Digite a quantidade de Kw gasto: ");
        quantKw = teclado.nextDouble();

        //processamento
        //parte 1 - saber quanto custa 1 kw
        valor1kw = salarioMinimo / 7.0 / 100.0;
        //parte 2 - saber o valor da conta total
        valorTotal = quantKw*valor1kw;
        // parte3 - saber o valor com desconto
        valorComDesonto = valorTotal *0.9;

        //saida
        System.out.printf("O valor de 1 kw R$ %.2f \n",valor1kw);
        System.out.printf("O valor total da conta R$ %.2f \n",valorTotal);
        System.out.printf("O valor com desconto kw R$ %.2f \n",valorComDesonto);

        teclado.close();
    }
}
