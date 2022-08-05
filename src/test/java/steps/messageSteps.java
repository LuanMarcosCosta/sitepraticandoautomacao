package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pages.messagePage;
import runner.RunCucumberTest;

public class messageSteps extends RunCucumberTest {

    messagePage messagePages = new messagePage(getdriver());
    @Dado("^que estou na tela de envio de mensagens$")
    public void que_estou_na_tela_de_envio_de_mensagens(){
        messagePages.acessarsite();
    }

    @Dado("^preencho todos os campos$")
    public void preencho_todos_os_campos() {
        messagePages.selecionaAssunto("Webmaster");
        messagePages.preecheEmail("Lucas.122@gmail.com");
        messagePages.preecheMensagem("Minha mensagem");
        messagePages.uploadArquivos("C:\\automationpractice\\automationpractice\\testeimage.jpeg");
    }

    @Quando("^clico em enviar mensagem$")
    public void clico_em_enviar_mensagem() {
        messagePages.clickSubmit();
    }

    @Entao("^vejo feedback de mensagem enviada com sucesso$")
    public void vejo_feedback_de_mensagem_enviada_com_sucesso() {
    }
}
