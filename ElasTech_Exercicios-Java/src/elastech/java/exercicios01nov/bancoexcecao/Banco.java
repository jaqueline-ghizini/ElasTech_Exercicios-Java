package elastech.java.exercicios01nov.bancoexcecao;

public class Banco {
   /* forma recebendo um valor
   public double saque(double saldo, double valor){
        saldo = saldo - valor;
        return saldo;

    }*/
    //forma recebndo um objeto
    public void saque(Conta c , double valor) throws SaqueInsuficienteException{

        c.varificaSaldo();
        if(c.getSaldo()>=valor) {
            c.setSaldo(c.getSaldo()-valor);
            System.out.println("Novo Saldo pos saque: "+c.getSaldo());
        }else{
            throw new SaqueInsuficienteException("Você não tem valor suficiente para sacar R$"+valor);
        }
    }
}
