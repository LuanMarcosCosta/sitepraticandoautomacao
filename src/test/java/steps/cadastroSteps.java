package steps;

import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pages.CadastroPage;
import runner.RunCucumberTest;

public class cadastroSteps extends RunCucumberTest {

    String nome = "Lucas";
    String sobrenome = "Costa";
    CadastroPage cadastroPage = new CadastroPage();
    @Quando("^eu preencho o formulario de cadastro$")
    public void EuPreenchooFormulariodeCadastro() {
        cadastroPage.selectTitle(1);
        cadastroPage.preenchePrimeiroNome(nome);
        cadastroPage.preencheUltimoNome(sobrenome);
        cadastroPage.preencheSenha("");
        cadastroPage.selecionaAniversario(10, 01, "1990");
        cadastroPage.preencheEndereco("Rua Silvano Costa, 778");
        cadastroPage.preencheCidade("New York");
        cadastroPage.preencheEstado("Colorado");
        cadastroPage.preencheCaixaPostal("88970");
        cadastroPage.preencheCelular("+55 (27) 99355-0987");
    }

    @Quando("^clcio em registrar$")
    public void ClicoemRegistrar() {
        cadastroPage.clicaRegistrar();
    }

    @Entao("^vejo cadastro realizado com sucesso$")
    public void CadastroRealizado() {
        cadastroPage.validaCadastro(nome, sobrenome);
    }
}
