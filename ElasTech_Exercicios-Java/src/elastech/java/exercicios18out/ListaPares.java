//exercicio while 2 18/10 listando pares
package elastech.java.exercicios18out;

public class ListaPares {
    public void listarPar(){
        int num =0;
       // int resto = 0;
        while(num <=100){
            //resto = num % 2;
            if(num%2 == 0){
               System.out.printf("%d ", num);
            }
            num++;
        }
    }
}
