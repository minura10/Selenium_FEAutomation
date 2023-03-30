package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class Test001 extends Base {

    @Test
    public  void Regression(){

        HomePage homepage = new HomePage();
        homepage.ClickMakeAppointment();

        LoginPage loginpage = new LoginPage();
        loginpage.TypeUserName("John Doe");
        loginpage.TypePassword("ThisIsNotAPassword");
        loginpage.ClickSignIn();

        MakeAppointmentPage appointmentpage = new MakeAppointmentPage();
        //Tokyo CURA Healthcare Center , Hongkong CURA Healthcare Center, Seoul CURA Healthcare Center
        appointmentpage.SelectFacility("Seoul CURA Healthcare Center");
        appointmentpage.ClickMedicaid();
        appointmentpage.TypeVisitDate("07/10/2023");
        appointmentpage.TypeComment("Automation describes a wide range of technologies that reduce human intervention in processes, namely by predetermining decision criteria, subprocess relationships, and related actions, as well as embodying those predeterminations in machines.");
        appointmentpage.ClickBookAppointment();

        AppointmentConfirmationPage confirmationpage = new AppointmentConfirmationPage();
        String ConfirmationTitle = confirmationpage.getConfirmationTitle();
        Assert.assertEquals(ConfirmationTitle, "Appointment Confirmation");
    }
}
