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
public class Pessoa {

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    private String nome;
    private String telefone;
    private int idade;
    
    public Pessoa(){
        this("", "", 0);
    }
    
    public Pessoa(String nom, String tel, int id){
        this.setNome(nom);
        this.setTelefone(tel);
        this.setIdade(id);
    }
    
    public Pessoa(Pessoa p){
        this(p.getNome(), p.getTelefone(), p.getIdade());
    }
    
    public boolean testeIdade(int idade){
        if (idade >= 0){
            return true;
        } else {
            return false;
        }        
    }    
    
    public String mostrarDados(){
        String retorno = "Nome: " + nome + " Idade: " + idade + " Telefone: " +telefone;
        return retorno;
    }
}
