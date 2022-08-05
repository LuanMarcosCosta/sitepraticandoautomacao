package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import support.Utils;

public class messagePage extends Utils {

    WebDriver driver;

    private By subjetc_field = By.id("id_contact");
    private By message_field = By.id("message");
    private By email_field = By.id("email");
    private By upload_field  = By.id("fileUpload");
    private By submit_buttom  = By.id("submitMessage");

    public messagePage(WebDriver driver){
        this.driver = driver;
    }

    public void acessarsite(){
        driver.get("http://automationpractice.com/index.php?controller=contact");
        esperarElementoEstarPresente(message_field, 20);
    }

    public void selecionaAssunto(String Assunto){
        Select select_Assunto = new Select(driver.findElement(subjetc_field));
        select_Assunto.selectByVisibleText(Assunto);
    }

    public void preecheEmail(String email) {
        driver.findElement(email_field).sendKeys(email);
    }
    public void preecheMensagem(String mensagem) {
        driver.findElement(message_field).sendKeys(mensagem);
    }

    public void uploadArquivos(String caminhoArquivo) {
        driver.findElement(upload_field).sendKeys(caminhoArquivo);
    }

    public void clickSubmit() {
        driver.findElement(submit_buttom).click();
    }
}


