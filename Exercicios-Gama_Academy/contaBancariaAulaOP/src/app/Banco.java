package app;

import core.ContaBancaria;

import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao;
        double valor;
        ContaBancaria conta = new ContaBancaria(1001,2,"Isidro","123.456.798-00",100.00);

        do{
            System.out.println("IsiBank - Seu banco na Internet!");
            System.out.println("Digite 1 - Deposito / 2 - Saque / 3- Info / 0- Sair");
            opcao = teclado.nextInt();

            switch (opcao){
                case 1 :
                    System.out.println(">>> DEPOSITO - Digite  o valor:");
                    valor = teclado.nextDouble();
                    conta.depositar(valor);
                    break;
                case 2:
                    System.out.println(">>> SAQUE - Digite  o valor:");
                    valor = teclado.nextDouble();
                    if (conta.sacar(valor)){
                        System.out.println(" SAQUE EFETUADO! ");
                    }else{
                        System.out.println(" SALDO INSUFICIENTE! ");
                    }
                    break;
                case  3:
                    System.out.println(">>> INFO: "+ conta.exibirDados());
                    break;
                case 0:
                    System.out.println(">>> OBRIGADO PELA PREFERENCIA - Volte Sempre! ");
                    break;
                default:
                    System.out.println("Opcao Invalida ***");
                    break;
            }
        }while (opcao !=0);
    }
}
