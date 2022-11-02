package elastech.java.exercicios01nov.bancoexcecao;


public class SaqueInsuficienteException extends Exception{
    public SaqueInsuficienteException() {

    }
    public SaqueInsuficienteException(String mensagem) {
        super(mensagem);
        System.out.println("");
    }
}
