package support;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import runner.RunCucumber;

public class Commands extends RunCucumber {

    public static void waitElementBeClickable(By element, Integer tempo) {
        WebDriverWait wait = new WebDriverWait(getDriver(), tempo);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void waitElementBeVisible(By element, Integer tempo) {
        WebDriverWait wait = new WebDriverWait(getDriver(), tempo);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public static void clickElement(By element) {
        System.out.println("##################################");
        try {
            System.out.println("Vai clicar no elemento: " + element);
            waitElementBeClickable(element, 10000);
            getDriver().findElement(element).click();
            System.out.println("Clicou no elemento: " + element);
        } catch (Exception error){
            System.out.println("********** Aconteceu um erro ao tentar clicar no elemento: " + element);
            System.out.println(error);
        }
        System.out.println("##################################");
    }

    public static void fillField(By element, String value) {
        System.out.println("##################################");
        try {
            System.out.println("Vai preencher o campo: " + element);
            waitElementBeVisible(element, 10000);
            getDriver().findElement(element).sendKeys(value);
            System.out.println("Preencheu o campo: " + element);
        } catch (Exception error){
            System.out.println("********** Aconteceu um erro ao tentar preencher o campo: " + element);
            System.out.println(error);
        }
        System.out.println("##################################");
    }

    public static void checkMessage(By element, String expectedMessage) {
        String actualMessage = "";
        System.out.println("##################################");
        System.out.println("Vai validar mensagem: " + expectedMessage);
        waitElementBeVisible(element, 10000);
        actualMessage = getDriver().findElement(element).getText();

        // Quando não der certo, vai quebrar o teste!!!
        Assert.assertEquals("Erro ao validar mensagens!", expectedMessage, actualMessage);
        // Quando não der certo, vai quebrar o teste!!!

        System.out.println("Validou mensagem: " + expectedMessage);
        System.out.println("##################################");
    }
}
