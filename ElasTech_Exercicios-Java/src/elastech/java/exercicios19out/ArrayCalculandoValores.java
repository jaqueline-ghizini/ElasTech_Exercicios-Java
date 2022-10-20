package elastech.java.exercicios19out;

public class ArrayCalculandoValores {

    int[] valores = new int[5];
    public void calcularValores(){
        valores[0] = 1;
        valores[1] = 2;
        valores[2] = 3;
        valores[3] = 4;
        valores[4] = 5;

        int total=0;

        // uma forma de fazer
        /*for(int i=0; i<5; i++){
            total +=valores[i];
        }*/

       // outra forma de fazer
        for (int i:valores) {
            total = total + i;
        }

        System.out.println("Soma dos valores: "+total);
    }
}
