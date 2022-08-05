package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import runner.RunCucumberTest;
import support.Utils;

public class CadastroPage extends RunCucumberTest {

    WebDriver webdriver;
    private By sexoM = By.id("id_gender1");
    private By sexoF = By.id("id_gender1");
    private By PrimeiroNome = By.id("customer_firstname");
    private By ultimoNome = By.id("customer_lastname");
    private By senha = By.id("passwd");

    private By diaNascimento = By.id("days");
    private By mesNascimento = By.id("months");
    private By anoNascimento = By.id("years");

    private By endereco = By.id("address1");
    private By cidade = By.id("city");
    private By estado = By.id("id_state");
    private By caixaPostal = By.id("postcode");
    private By numeroTelefone = By.id("phone_mobile");

    private By cliqueBotaoRegistro = By.id("submitAccount");


    public void selectTitle(Integer type){
        Utils.esperarElementoEstarPresente(sexoF, 20);

        if(type == 1){
            getdriver().findElement(sexoM).click();
        }else if(type == 2){
            getdriver().findElement(sexoF).click();
        }

    }

    public void preenchePrimeiroNome(String Primeironome){
        getdriver().findElement(PrimeiroNome).sendKeys(Primeironome);
    }

    public void preencheUltimoNome(String ultimonome){
        getdriver().findElement(ultimoNome).sendKeys(ultimonome);
    }

    public void preencheSenha(String senha){
        getdriver().findElement(this.senha).sendKeys(Utils.geraSenhaRamdom());
    }

    public void selecionaAniversario(Integer dia, Integer mes, String ano){
        Select select_dia = new Select(getdriver().findElement(diaNascimento));
        select_dia.selectByIndex(dia);

        Select select_mes = new Select(getdriver().findElement(mesNascimento));
        select_mes.selectByIndex(mes);

        Select select_ano = new Select(getdriver().findElement(anoNascimento));
        select_ano.selectByValue(ano);
    }

    public void preencheEndereco(String nomeEndereco){
        getdriver().findElement(endereco).sendKeys(nomeEndereco);
    }

    public void preencheCidade(String nomeCidade){
        getdriver().findElement(cidade).sendKeys(nomeCidade);
    }

    public void preencheEstado(String nomeEstado){
        Select select_estado = new Select(getdriver().findElement(estado));
        select_estado.selectByVisibleText(nomeEstado);
    }

    public void preencheCaixaPostal(String numeroCaixaPostal){
        getdriver().findElement(caixaPostal).sendKeys(numeroCaixaPostal);
    }

    public void preencheCelular(String numeroCelular){
        getdriver().findElement(numeroTelefone).sendKeys(numeroCelular);
    }

    public void clicaRegistrar(){
        getdriver().findElement(cliqueBotaoRegistro).click();
    }

    public void validaCadastro(String nome, String sobrenome){
        Utils.esperarElementoEstarPresente(By.className("navigation_page"), 20);
        String resultado_atual = getdriver().findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span")).getText();
        Assert.assertEquals(nome + " " + sobrenome, resultado_atual);
    }
}
