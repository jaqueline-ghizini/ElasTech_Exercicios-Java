import java.util.Scanner;

public class DiversasLeituras {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        int codigo;
        String nome, texto;
        double preco;

        System.out.println("Digite o código: ");
        texto = teclado.nextLine();
        codigo = Integer.parseInt(texto);
        System.out.println("Digite o nome do produto: ");
        nome = teclado.nextLine();// next ou nextLine para leitura de texto, next aceita o sim da entrada como sendo o enter, e o nextLine o espaco em branco e o enter
        
        System.out.println("Digite o preco (com . ou inves de ,): ");
        texto = teclado.nextLine();
        preco = Double.parseDouble(texto);

        System.out.println("Voce Digitou "+codigo+" - "+nome+" R$ "+preco);
        //impressão formatada:
        System.out.printf("Voce Digitou %d - %s R$ %.2f \n", codigo, nome, preco);
        teclado.close();
    }    
}
