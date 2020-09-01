/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapaprog1;

/**
 *
 * @author Pipipitchu
 */
public class Presidente extends Funcionario {

    public Presidente(double salario, int ramal, String nome, String documento) {
        super(salario, ramal, nome, documento);
    }

    public Presidente() {
    }

    
    
    @Override
    public void exibeDados() {
        System.out.println("--------------------------------------");
        System.out.println("     Nome: " + this.getNome());
        System.out.println("Documento: " + this.getDocumento());
        System.out.println("    Papel: Presidente");
    }
}
