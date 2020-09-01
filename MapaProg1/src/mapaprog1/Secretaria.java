
package mapaprog1;

public class Secretaria extends Funcionario {

    public Secretaria(double salario, int ramal, String nome, String documento) {
        super(salario, ramal, nome, documento);
    }

    public Secretaria() {
    }       
    
    @Override
    public void exibeDados() {
        System.out.println("--------------------------------------");
        System.out.println("     Nome: " + this.getNome());
        System.out.println("Documento: " + this.getDocumento());
        System.out.println("    Papel: Secretaria");
    }
}
