
package mapaprog1;

public class Cliente extends Pessoa {
    
    private String usuario, senha;

    public Cliente(String usuario, String senha, String nome, String documento) {
        super(nome, documento);
        this.usuario = usuario;
        this.senha = senha;
    }

    public Cliente() {
    }
    
    @Override
    public void exibeDados(){
        System.out.println("--------------------------------------");
        System.out.println("     Nome: " + this.getNome());
        System.out.println("Documento: " + this.getDocumento());
        System.out.println("    Papel: Cliente");
    }
    
    public boolean verificaSenha(String s){
        
        if (this.senha.equals(s)){
            return true;
        } else {
            return false;
        }
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
            
            
}
