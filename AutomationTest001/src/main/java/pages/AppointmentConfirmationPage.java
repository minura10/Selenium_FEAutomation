package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AppointmentConfirmationPage extends Base{

    public WebElement ConfimationTitle = driver.findElement(By.xpath("//h2[contains(text(),'Appointment Confirmation')]"));

    public String getConfirmationTitle(){
        return ConfimationTitle.getText();
    }
}
