package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.NinjaPage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TutorialStepDefinition {
    NinjaPage ninjaPage = new NinjaPage();
    List<String> sayfadakiList = new ArrayList<String>();
    List<String> sepettekiList = new ArrayList<String>();
    @When("kullanici phone sayfasina gider")
    public void kullaniciPhoneSayfasinaGider() {
        ninjaPage.phone.click();
    }

    @Then("telefonlarin marka adini alir")
    public void telefonlarinMarkaAdiniAlir() {
        for (WebElement w:ninjaPage.phoneName) {
            System.out.println("Sayfadaki isimler : "+w.getText());
            sayfadakiList.add(w.getText());
        }
    }

    @Then("tum ogeleri sepete ekle")
    public void tumOgeleriSepeteEkle() {
        for (WebElement w:ninjaPage.addToCart) {
            w.click();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Then("sepete tikla")
    public void sepeteTikla() {
        ninjaPage.sepet.click();
    }

    @Then("sepetteki isimleri al")
    public void sepettekiIsimleriAl() {
        for (WebElement w:ninjaPage.sepetList) {
            System.out.println("Sepetteki isimler : "+w.getText());
            sepettekiList.add(w.getText());
        }
    }

    @Then("sepetteki ve sayfadaki listeleri karsilastir")
    public void sepettekiVeSayfadakiListeleriKarsilastir() {
        Collections.sort(sayfadakiList);
        Collections.sort(sepettekiList);
        Assert.assertEquals(sayfadakiList,sepettekiList);

    }

    @And("kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int saniye) {
        try {
            Thread.sleep(saniye*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
