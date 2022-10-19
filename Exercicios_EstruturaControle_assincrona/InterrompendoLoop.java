//import java.util.Scanner;
public class InterrompendoLoop {
    public static void main(String[] args) {
        //Scanner teclado = new Scanner();

        //uma forma de usar o break
        for (int contador = 1; ;contador++){
            if(contador == 5){
                break;
            }
            System.out.println("contador ="+contador);
        }

        //outra forma de usar o break
        int conta = 1;
        while(true){
            if(conta ==5){
                break;
            }
            System.out.println("Contador ="+conta);
            conta++;
        }

        //uma forma usando continue
        for (int contador =1;contador <=10; contador++){
            if(contador == 5){
                continue;//ele ignnora o resto das instruções do for atural e vai para o próximo loop
            }
            System.out.println("Contador = "+contador);
        }
        //outra forma usando continue
        int cont =1 ;
        while (cont <= 10){
            if (cont ==5){
                continue;
            }
            System.out.println("Contador = "+cont);
            cont++;// depois que caiu no if não consegue mais somar e não consegue mais sair do while
        }
        System.out.println("Fim do programa.");
    }
}
