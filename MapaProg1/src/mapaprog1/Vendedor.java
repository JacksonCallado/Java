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
public class Vendedor extends Funcionario {
    
    private double comissao;

    public Vendedor(double salario, int ramal, String nome, String documento) {
        super(salario, ramal, nome, documento);
    }

    public Vendedor() {
    }

    public double salarioMesComComissao(){
        return this.salario + this.comissao;
    }
    
    @Override
    public void exibeDados() {
        System.out.println("--------------------------------------");
        System.out.println("     Nome: " + this.getNome());
        System.out.println("Documento: " + this.getDocumento());
        System.out.println("    Papel: Vendedor");
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    
    
}
