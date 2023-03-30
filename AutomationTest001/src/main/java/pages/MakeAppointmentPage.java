package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MakeAppointmentPage extends Base{

    public WebElement FacilityDropDown = driver.findElement(By.xpath("//select[@id='combo_facility']"));
    public WebElement HealthCareProgramRadioButton = driver.findElement(By.id("radio_program_medicaid"));
    public WebElement VisitDatePicker = driver.findElement(By.id("txt_visit_date"));
    public WebElement CommentText = driver.findElement(By.id("txt_comment"));
    public WebElement BookingAppointmentButton = driver.findElement(By.id("btn-book-appointment"));



    public void SelectFacility(String Facility){
        Select facility = new Select(FacilityDropDown);
        //Tokyo CURA Healthcare Center , Hongkong CURA Healthcare Center, Seoul CURA Healthcare Center
        facility.selectByValue(Facility);
    }

    public void ClickMedicaid(){
        HealthCareProgramRadioButton.click();
    }

    public void TypeVisitDate(String VisitDate){
        VisitDatePicker.sendKeys(VisitDate);
    }

    public void TypeComment(String Comment){
        CommentText.sendKeys(Comment);
    }

    public void ClickBookAppointment(){
        BookingAppointmentButton.click();
    }
}
