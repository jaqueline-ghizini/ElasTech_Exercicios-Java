import java.util.Scanner;

public class BC1017 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int tempoHora;
        int velocidadeMedia;

        int distancia;
        double consumo;

        //entrada
        tempoHora = teclado.nextInt();
        velocidadeMedia = teclado.nextInt();
        
        //processamento
        distancia = tempoHora * velocidadeMedia;
        consumo = distancia / 12.0;
        
        //saídda
        System.out.printf("%.3f\n", consumo);

        teclado.close();
    }
}
