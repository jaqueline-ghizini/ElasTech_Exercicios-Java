package app;

import model.Conta;
import model.ContaEspecial;

public class PIBank {
    public static void main(String[] args) {
        Conta c1 = new Conta("Joao", "123.456.789-00", 1234, 100);

        System.out.println(c1);

        Conta c2 =new ContaEspecial("Jose","987.654.321-00", 9876,100.00,100.00);
        System.out.println(c2);

        c1.debitar(80);
        c2.debitar(100);

        System.out.println(c1);
        System.out.println(c2);
    }
}
