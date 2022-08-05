package support;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import runner.RunCucumberTest;

import java.util.Random;

public class Utils extends RunCucumberTest {

    public static void esperarElementoEstarPresente(By element, int tempo){
        WebDriverWait wait = new WebDriverWait(getdriver(), tempo);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static String geraEmailrandom(){
        String emaiInit = "luanTeste_";
        String emailFinal = "@qa.com.br";

        Random ramdom = new Random();
        int minimo = 1;
        int maximo = 99999;

        int resultado = ramdom.nextInt(maximo-minimo) + minimo;

        return emaiInit + resultado + emailFinal;
    }

    public static String geraSenhaRamdom(){
        String senhaInit = "S3";
        String senhaFinal = "Nh@";

        Random random = new Random();
        int minimo = 1980;
        int maximo = 2022;

        int resultado = random.nextInt(maximo-minimo);

        return senhaInit + resultado + senhaFinal;
    }
}
