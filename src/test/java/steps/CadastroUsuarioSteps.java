package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.CadastroUsuarioPage;
import pages.LoginPage;
import runner.RunCucumber;
import support.ScreenshotUtils;

import static support.Utils.*;

public class CadastroUsuarioSteps extends RunCucumber {

    LoginPage loginPage = new LoginPage();
    CadastroUsuarioPage cadastroPage = new CadastroUsuarioPage();

    @Dado("^que estou na tela de cadastro de usuário$")
    public void que_estou_na_tela_de_login() {
        loginPage.acessarAplicao();
        loginPage.acessarTelaCadastro();
    }

    @Dado("^preencho todos os campos obrigatórios$")
    public void preencho_campos_obrigatorios() {
        cadastroPage.preencheNome(getName());
        cadastroPage.preencheEmail(getRandomEmail());
        cadastroPage.preencherSenha(getPassword(true));
    }

    @Quando("^clico em cadastrar$")
    public void clico_cadastrar() {
        cadastroPage.cadastrarUsuario();
    }

    @Então("^vejo mensagem de usuário cadastrado com sucesso$")
    public void vejo_mensagem_cadastro_sucesso() {
        cadastroPage.verificaCadastroSucesso();
    }

    @After
    public static void afterScenario(Scenario scenario) {
        ScreenshotUtils.addScreenshotOnScenario(scenario);
    }
}
