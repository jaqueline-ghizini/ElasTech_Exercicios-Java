package elastech.java;

import elastech.java.exercicios19out.*;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Exercicio Um
        /*exercicioUm um = new exercicioUm();
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

        //exercicio while 1 18/10
        Curso curso = new Curso();
        curso.escreveNome();

        //exercicio while 2 18/10
        ListaPares listap = new ListaPares();
        listap.listarPar();

        System.out.println();//para publar linha

        //exercicio while 3 18/10
        ListaImpares listai = new ListaImpares();
        listai.listarImpar();*/

        //Exercicio um for 19/10
        //TabuadaFor tabuada = new TabuadaFor();
        //tabuada.escreveTabuada();

        //Exercicio dois for 19/10
        //TabuadaForDois tabuadaDois = new TabuadaForDois();
        //tabuadaDois.escreveTabuadaDois();

        //Exercicio exemplo da professora de tabuada com StringBuffer 19/10
        //TabuadaStringBuffer tabusb = new TabuadaStringBuffer();
        //tabusb.escreveTabuadaSB();

        //Exercicio Um Array 19/10
        //ArrayCidade cidades = new ArrayCidade();
        //cidades.mostrarCidades();

        //Exercicio Dois Array 19/10
        ArrayCalculandoValores cal = new ArrayCalculandoValores();
        cal.calcularValores();

        //Exercicio Tres Array 19/10
        ArrayMenorNumero menor = new ArrayMenorNumero();
        menor.verificaMenorValor();
    }
}
//atalhos
//sout+tab para digitar automatico o System.out.print
//digita main pra digitar public static void main(String[] args) {}

