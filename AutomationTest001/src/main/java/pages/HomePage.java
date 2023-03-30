package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends  Base{

    private WebElement MakeAppointmentButton = driver.findElement(By.xpath("//a[contains(text(),'Make Appointment')]"));

    public void ClickMakeAppointment(){
        MakeAppointmentButton.click();
    }
}
