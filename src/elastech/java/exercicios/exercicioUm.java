package elastech.java.exercicios;

//EXERCICIO UM IF-ELSE - informa imposto
public class exercicioUm {

        public double salario;

        //salario = 5000;
        public int informaValorImposto(double salario){
            if(salario>=5000){
                return 15;
            }else{
                return 5;
            }
        }
}
