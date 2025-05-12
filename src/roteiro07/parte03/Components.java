package roteiro07.parte03;

public class Components {
    private String nome;

    public Components(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    @Override
    public String toString(){
        return nome;
    }
}
