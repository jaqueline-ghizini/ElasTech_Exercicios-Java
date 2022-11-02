package elastech.java.exercicios01nov.bancoexcecao;

public class Conta {
    private double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void varificaSaldo() throws SaqueInsuficienteException{
        System.out.println("Saldo em conta: "+saldo);
        if(saldo>0.0) {
            System.out.println("Seu saldo esta positivo.");
        }else{
            throw new SaqueInsuficienteException("Nao e possivel realizar o saque pois seu saldo ja esta negativo.");
        }
    }


}
