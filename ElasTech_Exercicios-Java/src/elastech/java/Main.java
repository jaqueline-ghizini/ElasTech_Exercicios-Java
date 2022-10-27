package elastech.java;

import elastech.java.exercicios15out.*;
import elastech.java.exercicios18out.*;
import elastech.java.exercicios19out.*;
import elastech.java.exercicios20out.*;
import elastech.java.exercicios26out.Impressao;
import elastech.java.exercicios26out.MultiplosDeQuatro;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Exercicio Um 15/10
        /*exercicioUm um = new exercicioUm();
        System.out.print("Digite o seu salario: ");
        um.salario = teclado.nextDouble();
        System.out.println(um.informaValorImposto(um.salario));
         */

        //Exercicio Dois 15/10
        /*ExercicioDois dois = new ExercicioDois();
        System.out.print("Digite a hora no padrao de 0 a 23: ");
        dois.hora = teclado.nextInt();
        dois.verificaPeriodo(dois.hora);
         */

        //Exercicio Tres - exercicio Um switch 15/10
        /*
        ExercicioTres tres = new ExercicioTres();
        System.out.print("Digite o mes em numero: ");
        tres.mes = teclado.nextInt();
        tres.escreverMesExtenso(tres.mes);
        */

        //Exercicio Quatro - exercicio um do operador ternario 15/10
       /* ExercicioQuatro quatro = new ExercicioQuatro();
        System.out.print("Digite o seu salario: ");
        quatro.salarioTern = teclado.nextDouble();
        System.out.println(quatro.informarValorImposto(quatro.salarioTern));
        */

        //-----------------------------------------------------------------
        //exercicio while 1 18/10
        //Curso curso = new Curso();
        //curso.escreveNome();

        //exercicio while 2 18/10
        //ListaPares listap = new ListaPares();
        //listap.listarPar();
        //System.out.println();//para publar linha

        //exercicio while 3 18/10
        //ListaImpares listai = new ListaImpares();
        //listai.listarImpar();*/

        //-----------------------------------------------------------------
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
        //ArrayCalculandoValores cal = new ArrayCalculandoValores();
        //cal.calcularValores();

        //Exercicio Tres Array 19/10
        //ArrayMenorNumero menor = new ArrayMenorNumero();
        //menor.verificaMenorValor();

        //-----------------------------------------------------------------
        //Exercicio Um Carro_POO 20/10
       /* CarroPOO carro = new CarroPOO("Fiat", "Azul"); //objeto Um
        System.out.println(carro.getMarca());
        System.out.println(carro.getCor()+"\n");

        CarroPOO carro2 = new CarroPOO();//objeto dois
        carro2.setMarca("Chevrolet");
        carro2.setCor("Preto");
        System.out.println(carro2.getMarca());
        System.out.println(carro2.getCor()+"\n");

        CarroPOO carro3 = new CarroPOO();//objeto tres
        carro3.setKm(10000);
        carro3.setAno(2022);
        carro3.setNumPortas(4);
        carro3.setPreco(55000);
        System.out.println(carro3.getKm() + "\n" + carro3.getAno() + "\n" + carro3.getNumPortas() +"\n" + carro3.getPreco());
        */


        //Exercicio Dois POO Predio 20/10
       /* PredioPOO predio1 = new PredioPOO();
        predio1.setNumApts(5);
        predio1.setEndereco("Rua das Flores 10");
        predio1.setCidade("Rio de Janeiro");
        predio1.setEstado("Rio de Janeiro");
        System.out.println(predio1.toString());*/

        /*PredioPOO predio2 = new PredioPOO();
        predio2.setNumApts(0);
        predio2.setEndereco("Rua Rio Branco");
        predio2.setCidade("Marilia");
        predio2.setEstado("São Paulo");
        System.out.println(predio2.toString());*/

        //Exercicio Impressao 26/10
        Impressao imp = new Impressao();
        imp.imprimeNumerosFor();
        imp.imprimeNumeroWhile();
        int[] array = {1, 2, 3, 4, 5};
        imp.imprimeArray(array);

        //Exercicio Multiplos de Quatro
        MultiplosDeQuatro mult = new MultiplosDeQuatro();
        mult.exibeMultiplosQuatro();

    }
}
//atalhos
//sout+tab para digitar automatico o System.out.print
//digita main pra digitar public static void main(String[] args) {}

