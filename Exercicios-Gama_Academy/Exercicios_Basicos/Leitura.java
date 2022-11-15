import java.util.Scanner;

public class Leitura {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in); // para pegar informações digitadas
            int valorInteriro;
            float valorFloat;

            System.out.println("Por favor, diigte um valor interiro: ");
            valorInteriro = teclado.nextInt(); //recebe valor interiro

            System.out.println("Por favor, digite um valor real com , ");//ele reconhece o idioma do sistema base pra fazer a entrada, por isso tem que ser com , mas ele armazena e exibe com .
            valorFloat = teclado.nextFloat();

            System.out.println("Você digitou os valores "+valorInteriro+" e "+valorFloat);
        teclado.close();
    }
}
