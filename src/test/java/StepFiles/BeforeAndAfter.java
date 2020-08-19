package StepFiles;

import Utils.BaseDriver;
import cucumber.api.Scenario;
import cucumber.api.java.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BeforeAndAfter {

    @Before // Before each scenario
    public void before(Scenario scenario) {
        System.out.println("Before scenario: " + scenario.getName());
    }

    @After // After each scenario
    public void after(Scenario scenario) {

        System.out.println(scenario.getStatus() + " status of the scenario"); // scenario is passed or failed.
        System.out.println(scenario.getId() + " id of the scenario");
        System.out.println(scenario.getName() + " name of the scenario");

        if (scenario.getStatus().equalsIgnoreCase("failed")) {
//        Take Screen shot is coming from the selenium.
            TakesScreenshot Screenshot = ((TakesScreenshot) BaseDriver.getDriver()); // which driver to get a screen shot

//        File is coming from JAVA
            File srcFile = Screenshot.getScreenshotAs(OutputType.FILE);
            String featureFileName = scenario.getName();

//        Adding the today date and time to our screen shot name
            Date now = new Date();
            SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd HH mm ss");
            String dateInString = formater.format(now);
            dateInString = dateInString.replace(":", " ");

//        Location of the screenshot.
            File destinationFile = new File("target/FailedScreenShots/" + featureFileName + dateInString + ".png");
            try {
                FileUtils.copyFile(srcFile, destinationFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    //    BaseDriver.quiteDriver();
    }
}
