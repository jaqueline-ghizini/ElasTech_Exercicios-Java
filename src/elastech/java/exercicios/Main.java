package elastech.java.exercicios;

import elastech.java.exercicios.ExercicioDois;
import elastech.java.exercicios.ExercicioTres;
import elastech.java.exercicios.exercicioUm;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Exercicio Um
        exercicioUm um = new exercicioUm();
        System.out.print("Digite o seu salario: ");
        um.salario = teclado.nextDouble();
        System.out.println(um.informaValorImposto(um.salario));

        //Exercicio Dois
        ExercicioDois dois = new ExercicioDois();
        System.out.print("Digite a hora no padrao de 0 a 23: ");
        dois.hora = teclado.nextInt();
        dois.verificaPeriodo(dois.hora);

        //Exercicio Tres - exercicio Um switch
        ExercicioTres tres = new ExercicioTres();
        System.out.print("Digite o mes em numero: ");
        tres.mes = teclado.nextInt();
        tres.escreverMesExtenso(tres.mes);

        //Exercicio Quatro - exercicio um do operador ternario
        ExercicioQuatro quatro = new ExercicioQuatro();
        System.out.print("Digite o seu salario: ");
        quatro.salarioTern = teclado.nextDouble();
        System.out.println(quatro.informarValorImposto(quatro.salarioTern));
     }
}
//atalhos
//sout+tab para digitar automatico o System.out.print
//digita main pra digitar public static void main(String[] args) {}

