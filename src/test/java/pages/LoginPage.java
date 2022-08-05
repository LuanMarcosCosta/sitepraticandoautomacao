package pages;

import org.openqa.selenium.By;
import runner.RunCucumberTest;
import support.Utils;

public class LoginPage extends RunCucumberTest {

    private By create_email = By.id("email_create");
    private By create_email_botao = By.id("SubmitCreate");

    public  void acessarTelaLogin(){
        getdriver().manage().window().maximize();
        getdriver().get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        Utils.esperarElementoEstarPresente(create_email, 10);
    }

    public void criaEmail(){
        getdriver().findElement(create_email).sendKeys(Utils.geraEmailrandom());
    }

    public void clicarCriarConta(){
        getdriver().findElement(create_email_botao).click();
    }
}
