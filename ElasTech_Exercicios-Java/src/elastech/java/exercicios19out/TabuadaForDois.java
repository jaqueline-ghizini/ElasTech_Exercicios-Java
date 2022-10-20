//Exercicio dois for 19/10
package elastech.java.exercicios19out;

public class TabuadaForDois {
    public void escreveTabuadaDois(){
        int multiplicacao =0;
        for(int cont=1; cont<10; cont++){
            for(int x=0; x<10; x++) {
                multiplicacao = cont * x;
                System.out.println(cont+" X " + x + " = " + multiplicacao);
            }
            System.out.println();
        }
    }
}
