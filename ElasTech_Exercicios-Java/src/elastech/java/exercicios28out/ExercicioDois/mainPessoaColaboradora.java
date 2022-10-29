package elastech.java.exercicios28out.ExercicioDois;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class mainPessoaColaboradora {
    public static void main(String[] args) {
        List<PessoaColaboradora> lista = new ArrayList<PessoaColaboradora>();

        lista.add(new PessoaColaboradora("João", 1500.60, 22));
        lista.add(new PessoaColaboradora("Maria", 4000.00, 40));
        lista.add(new PessoaColaboradora("Ana", 1000.25,31));

        //só exibe o salário
        /*lista.stream()
                .map(p -> (p.getSalario() + p.getSalario() * 0.15))
                .forEach(p -> {System.out.println(p);});*/

        //exibe lista 1 aumenta 15 % de todos
        /*ArrayList listaPessoas = (ArrayList) lista.stream().map(p ->
        {
            p.setSalario(p.getSalario() + (p.getSalario()* 0.15));
            return p;
        }).collect(Collectors.toList());

        lista.forEach(p -> System.out.println(p.getNome() + " - " + p.getSalario() + " - "+ p.getIdade()));*/

        //exibe lista 2 aumenta 20% de pessoas maiores que 30 anos
        ArrayList listaPessoaVelha = (ArrayList) lista.stream()
                .filter( p -> p.getIdade()>30)
                .map(p -> {
                    p.setSalario(p.getSalario() + (p.getSalario()* 0.20));
                    return p;
                }).collect(Collectors.toList());

        lista.forEach(p -> System.out.println(p.getNome() + " - " + p.getSalario() + " - "+ p.getIdade()));

    }
}
