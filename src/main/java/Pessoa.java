public class Pessoa {

    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        setNome(nome);
        setIdade(idade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String apresentarPessoa() {
        if (!getNome().equals("") && getIdade() > 0 && getIdade() < 100){
            return (String.format("Seu nome é " + getNome() + "\n Você tem " + getIdade() + " anos"));
        } else  {
            return "Pessoa com dados inválidos";
        }
    }
}
