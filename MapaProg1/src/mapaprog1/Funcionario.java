
package mapaprog1;


abstract public class Funcionario extends Pessoa {
    
    protected double salario;
    protected int ramal;

    public Funcionario(double salario, int ramal, String nome, String documento) {
        super(nome, documento);
        this.salario = salario;
        this.ramal = ramal;
    }
       
    public Funcionario() {
    }

    public double calcularSalarioAnual(){
        return this.salario * 13;
    }
    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getRamal() {
        return ramal;
    }

    public void setRamal(int ramal) {
        this.ramal = ramal;
    }
    
    
    
}
