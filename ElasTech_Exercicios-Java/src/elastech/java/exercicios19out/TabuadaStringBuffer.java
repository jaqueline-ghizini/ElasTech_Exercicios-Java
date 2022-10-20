//Exercicio exemplo da professora de tabuada com StringBuffer
package elastech.java.exercicios19out;

public class TabuadaStringBuffer {
    public void escreveTabuadaSB(){
        StringBuffer sb = new StringBuffer();

        for(int i = 0; i<10; i++){
            int resultado = 2*i;

            sb.append("2 * ").append(i);
            sb.append(" = ");
            sb.append(resultado);
            sb.append(System.getProperty("line.separator"));
        }
        System.out.println(sb.toString());
    }
}
