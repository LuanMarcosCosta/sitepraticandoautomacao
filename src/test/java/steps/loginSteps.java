package steps;

import cucumber.api.java.pt.Dado;
import pages.LoginPage;
import runner.RunBase;
import runner.RunCucumberTest;

public class loginSteps extends RunCucumberTest {

    LoginPage loginPage = new LoginPage();
    @Dado("^que estou na tela de login$")
    public void Telalogin()  {
        getdriver(Browser.CHROME);
        loginPage.acessarTelaLogin();
    }

    @Dado("^acesso o cadastro de usuario$")
    public void AcessooCadastrodeUsuario()  {
        loginPage.criaEmail();
        loginPage.clicarCriarConta();
    }
}
