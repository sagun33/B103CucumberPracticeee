package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinition {
    AmazonPage amazonPage;

    @Given("kullanici amazona gider")
    public void kullaniciAmazonaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }

    @When("kullanici iphone için arama yapar")
    public void kullaniciIphoneIçinAramaYapar() {
        amazonPage = new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("iphone", Keys.ENTER);
    }

    @And("sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }
}
