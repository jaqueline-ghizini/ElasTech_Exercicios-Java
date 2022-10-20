package elastech.java.exercicios19out;

public class ArrayMenorNumero {
    public void verificaMenorValor(){
        int[] valores = {14, 56, 1, 80};
        int menor = valores[0];

        for (int x = 1; x<valores.length; x++) {
            if (valores[x] < menor) {
                menor = valores[x];
            }
            //menor = Math.min(menor, valores[x]);// outra forma de fazer
        }
        System.out.println("O menor valor e: "+menor);
    }
}
