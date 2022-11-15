import java.util.Scanner;
public class TesteVetor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double valores[];        
        
        valores = new double[10]; /// reserva 10 espacos pra arqmazenar

        System.out.println(("Digite valores"));
        for(int pos=0; pos <10; pos++){
            valores[pos]= teclado.nextDouble();
        }

        System.out.println("Vou mostrar agora os valores digitados - todos na mesma linha ...");
        for(int pos = 0; pos < valores.length; pos++){
            System.out.printf("%.1f ",valores[pos]);
        }
        
        teclado.close();
    }
}
