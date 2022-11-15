import java.util.Scanner;
public class BC1143 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        System.out.println("informe até que numero quer fazer a potenciacao");
        int N = teclado.nextInt();

        for(int num=1; num <= N; num ++){
            System.out.println(num+ " "+(num*num)+" "+(num+num+num));
        }
    teclado.close();
    }
}
