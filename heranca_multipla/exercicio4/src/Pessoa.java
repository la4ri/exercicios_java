public class Pessoa {
    String nome, sobrenome;

    public Pessoa() {}

    public Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public String getSobrenome() {return sobrenome;}
    public void setSobrenome(String sobrenome) {this.sobrenome = sobrenome;}

    public String getNomeCompleto() {
        return this.nome +" "+ this.sobrenome;
    }
}