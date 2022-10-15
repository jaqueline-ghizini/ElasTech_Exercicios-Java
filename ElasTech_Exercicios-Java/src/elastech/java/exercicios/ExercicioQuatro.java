package elastech.java.exercicios;


//EXERCICIO UM OPERADOR TERNARIO - informa salario
public class ExercicioQuatro {
    public double salarioTern;

    //salario = 5000;
    public int informarValorImposto(double salarioTern){
        int retorno = (salarioTern>=5000)? 15: 5;
        return retorno;
    }

}
