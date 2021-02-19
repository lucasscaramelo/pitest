import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PessoaTest {

    Pessoa pessoa;

    @Test
    public void pessoaCompleta() {
        pessoa = new Pessoa("Lucas", 20);
        String  esperado = "Seu nome é Lucas\n Você tem 20 anos";
        String resultado = pessoa.apresentarPessoa();
        Assertions.assertEquals(esperado, resultado);
    }

    @Test
    public void pessoaSemNome() {
        pessoa = new Pessoa("", 20);
        String  esperado = "Pessoa com dados inválidos";
        String resultado = pessoa.apresentarPessoa();
        Assertions.assertEquals(esperado, resultado);
    }

    @Test
    public void pessoaIdadeInvalida() {
        pessoa = new Pessoa("Lucas", 2000);
        String  esperado = "Pessoa com dados inválidos";
        String resultado = pessoa.apresentarPessoa();
        Assertions.assertEquals(esperado, resultado);
    }

}
