package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends Base {

    private WebElement UserNameText = driver.findElement(By.xpath("//input[@id='txt-username']"));
    private WebElement PasswordText = driver.findElement(By.xpath("//input[@id='txt-password']"));
    private WebElement SignInButton = driver.findElement(By.xpath("//button[@id='btn-login']"));

    public void TypeUserName(String UserName){
        UserNameText.sendKeys(UserName);
    }

    public  void TypePassword (String Password){
        PasswordText.sendKeys(Password);
    }

    public void ClickSignIn (){
        SignInButton.click();
    }

}
