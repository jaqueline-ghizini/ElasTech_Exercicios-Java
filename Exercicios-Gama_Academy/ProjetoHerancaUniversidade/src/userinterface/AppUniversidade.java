package userinterface;

import core.Estudante;
import core.Pessoa;

public class AppUniversidade {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Isidro","isidro@gmail.com","987654321");

        System.out.println(p.exibirInfo());

        Estudante e = new Estudante("Jose", "ose@email.com", "912345678", 12345, "Computacao");

        System.out.println((e.exibirInfo()));
    }
}
