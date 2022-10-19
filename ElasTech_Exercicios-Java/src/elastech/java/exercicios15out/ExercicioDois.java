package elastech.java.exercicios15out;

//EXERCICIO DOIS IF-ELSE - informa perido do dia
public class ExercicioDois {

    public int hora;

    public void verificaPeriodo(int hora){
        if((hora>=0)&&(hora<=5)){
            System.out.println("Madrugada");
        }else if((hora>5)&&(hora<12)){
            System.out.println("Manhã");
        }else if((hora>=12)&&(hora<18)){
            System.out.println("Tarde");
        }else{
            System.out.println("Noite");
        }
    }
}
