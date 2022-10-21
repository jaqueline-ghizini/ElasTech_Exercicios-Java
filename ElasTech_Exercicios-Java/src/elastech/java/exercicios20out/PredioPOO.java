//Exercicio Dois POO Predio 20/10
package elastech.java.exercicios20out;

public class PredioPOO {
    String endereco;
    String cidade;
    String estado;
    int numApts;

    public PredioPOO() {
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getNumApts() {
        return numApts;
    }

    public void setNumApts(int numApts) {
        if(numApts > 0){
            this.numApts = numApts;
        }else {
            System.out.println("Numero de apartamento invalido");
        }
    }

    public String toString(){
        return "Numero de Apartamentos = "+getNumApts()+ "\n"+
                "Endereco = "+getEndereco()+"\n"+
                "Cidade = "+getCidade()+"\n"+
                "Estado = "+getEstado()+"\n\n";
    }

}
