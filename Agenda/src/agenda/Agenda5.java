/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

/**
 *
 * @author lytt1
 */
public class Agenda5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa("Joao", "123456", 45);
        
        Pessoa p3 = p2;
        
        p2.setIdade(12);
        
        /*
        p1.nome = "Antonio";
        p1.telefone = "456453";
        p1.idade = 33;
        
        p2.idade = 12;
        */
        
        System.out.println(p1.mostrarDados());
        System.out.println(p2.mostrarDados());
        System.out.println(p3.mostrarDados());
    }
    
}
