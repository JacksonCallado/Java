
package mapaprog1;

abstract public class Pessoa {
    
    protected String nome,documento;

    public Pessoa() {
    }

    public Pessoa(String nome, String documento) {
        this.nome = nome;
        this.documento = documento;
    } 
    
    abstract public void exibeDados();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }
    
    
}
