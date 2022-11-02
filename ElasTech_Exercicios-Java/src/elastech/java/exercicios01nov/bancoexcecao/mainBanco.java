package elastech.java.exercicios01nov.bancoexcecao;

public class mainBanco {
    public static void main(String[] args) {
        Banco b = new Banco();

        try{// conta 1
        Conta c = new Conta(1500.00);

        //forma enviando um valor
        //double saldoConta = c.getSaldo();
        //c.setSaldo(b.saque(saldoConta, 1600.00));

            //forma enviando um obejto
        b.saque(c,1600.00);
        //c.varificaSaldo();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println();

        try{// conta 2
            Conta c2 = new Conta(-100.00);
            b.saque(c2,50.00);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println();

        try{// conta 3
            Conta c3 = new Conta(1000.00);
            b.saque(c3,50.00);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
