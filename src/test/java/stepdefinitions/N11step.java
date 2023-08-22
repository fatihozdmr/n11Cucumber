package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.N11Page;
import utilities.ConfigReader;

import static utilities.Driver.driver;
import static utilities.Driver.getDriver;


public class N11step {

    N11Page n11Page = new N11Page();
    Actions actions = new Actions(getDriver());

    @Given("Kullanici anasayfaya gider")
    public void kullaniciAnasayfayaGider() {

    }

    @When("Anasayfanin yuklendigini dogrular")
    public void anasayfaninYuklendiginiDogrular() {
        String actualTitle = driver.getTitle();
        String expectedTitle = "n11 - 10 Üzerinden 11'lik Alışveriş Deneyimi";
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @And("Kullanici anasayfada Giris Yap butonunu bulur ve tiklar")
    public void kullaniciAnasayfadaGirisYapButonunuBulurVeTiklar() {
        n11Page.btnGirisYap.click();
    }

    @And("Giris sayfasinin yuklendigini dogrular")
    public void girisSayfasininYuklendiginiDogrular() {
        String actualUrl = getDriver().getCurrentUrl();
        String expectedUrl = "https://www.n11.com/giris-yap";
        Assert.assertTrue(actualUrl.equals(expectedUrl));
    }

    @And("Kullanici giris sayfasinda kullanici adi alanina gecerli bir kullanici adi girer")
    public void kullaniciGirisSayfasindaKullaniciAdiAlaninaGecerliBirKullaniciAdiGirer() {
        n11Page.email.sendKeys(ConfigReader.getProperty("email"));
    }

    @And("Kullanici giris sayfasinda kullanici sifre alanina gecerli bir sifre girer")
    public void kullaniciGirisSayfasindaKullaniciSifreAlaninaGecerliBirSifreGirer() {
        n11Page.password.sendKeys(ConfigReader.getProperty("password"));
    }

    @And("Kullanici {string} butonuna tiklar")
    public void kullaniciButonunaTiklar(String arg0) {
        n11Page.btnLogin.click();
    }

    @Then("Kullanici hesabina basariyla giris yapildigini dogrular")
    public void kullaniciHesabinaBasariylaGirisYapildiginiDogrular() {
        actions.moveToElement(n11Page.btnHesabim).perform();
        Assert.assertTrue(n11Page.btnCikisYap.isEnabled());
    }

}
