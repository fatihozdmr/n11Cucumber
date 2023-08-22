package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class N11Page {

    public N11Page(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(css = ".btnSignIn")
    public WebElement btnGirisYap;

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "loginButton")
    public WebElement btnLogin;

    @FindBy(css = ".user")
    public WebElement btnHesabim;

    @FindBy(css = ".logoutBtn")
    public WebElement btnCikisYap;


}
