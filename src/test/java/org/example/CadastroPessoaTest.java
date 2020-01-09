package org.example;

import org.assertj.core.api.Assertions;
import org.assertj.core.internal.bytebuddy.build.ToStringPlugin;
import org.junit.Test;

public class CadastroPessoaTest {

    @Test
    public void deveCriarCadastroDePessoaTest(){
        //cenario e execucao
        CadastroPessoas cadastro = new CadastroPessoas();

        //verificacao
        Assertions.assertThat(cadastro.getPessoas()).isEmpty();
    }


    @Test
    public void deveAdicionarUmaPessoaTest(){
        CadastroPessoas cadastroPessoas = new CadastroPessoas();
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("JOSE");
        cadastroPessoas.adicionar(pessoa);


        Assertions.assertThat(cadastroPessoas.getPessoas())
                .isNotEmpty()
                .hasSize(1)
                .contains(pessoa);
    }

    @Test(expected = PessoaSemNomeException.class)
    public void naoDeveCadastrarUmaPessoaComNomeVazioTest(){

        CadastroPessoas cadastroPessoas = new CadastroPessoas();
        Pessoa pessoa = new Pessoa();

        cadastroPessoas.adicionar(pessoa);

    }

    @Test
    public void deveRemoverUmaPessoaTest(){
        //cenario
        CadastroPessoas cadastroPessoas = new CadastroPessoas();
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("JOSE");
        cadastroPessoas.adicionar(pessoa);

        //execucao
        cadastroPessoas.remover(pessoa);

        Assertions.assertThat(cadastroPessoas.getPessoas()).isEmpty();
    }

    @Test(expected = CadastroVazioException.class)
    public void deveLancarErroAoTentarRemoverPessoaInexistenteTest(){
        //cenario
        CadastroPessoas cadastroPessoas = new CadastroPessoas();
        Pessoa pessoa = new Pessoa();

        //execução
        cadastroPessoas.remover(pessoa);

    }


}
