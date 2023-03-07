package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.DqaPage;
import utilities.Driver;

import java.time.Duration;

public class DemoQAStepDefinition {
    DqaPage dqaPage = new DqaPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
    Actions actions = new Actions(Driver.getDriver());
    @Then("kullanici alerte tiklar")
    public void kullaniciAlerteTiklar() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        dqaPage.alert.click();
    }

    @And("kullanici on button click alert will appear after bes seconds karsisindaki click me butonuna basar")
    public void kullaniciOnButtonClickAlertWillAppearAfterBesSecondsKarsisindakiClickMeButonunaBasar() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        dqaPage.onButtonClick.click();
    }
    @And("kullanici alertin gorunur olmasini bekler")
    public void kullaniciAlertinGorunurOlmasiniBekler() {
        wait.until(ExpectedConditions.alertIsPresent());

    }
    @And("kullanici alert uzerindeki yazinin This alert appeared after bes seconds oldugunu test eder")
    public void kullaniciAlertUzerindekiYazininThisAlertAppearedAfterBesSecondsOldugunuTestEder() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String alertYazisi = Driver.getDriver().switchTo().alert().getText();
        String beklenenYazi = "This alert appeared after 5 seconds";
        Assert.assertEquals(beklenenYazi,alertYazisi);
    }
    @And("kullanici ok diyerek alerti kapatir")
    public void kullaniciOkDiyerekAlertiKapatir() {
        Driver.getDriver().switchTo().alert().accept();
    }
}
