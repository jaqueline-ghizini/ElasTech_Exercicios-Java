import java.util.Scanner;
public class TabuadaV3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o numero que quer calcular a Tabuada. ");
        int numero = teclado.nextInt();

        for (int contador = 1; contador <= 10; contador++){
            System.out.println(numero+" x " +contador+" = "+(numero*contador));
        }
        teclado.close();
    }
}
