package elastech.java.exercicios26out;

public class Impressao {

    public void imprimeNumerosFor() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println();
    }
    public void imprimeNumeroWhile(){
        int n=1;
        while (n<=10){
            System.out.println(n);
            n++;
        }
        System.out.println();
    }

    public void imprimeArray(int[] array){
        for (int num: array) {
            System.out.println(num);
        }
        System.out.println();
    }

}
