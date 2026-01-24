package SeleniumBasics;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.apache.commons.io.FileUtils;

import java.io.File;

public class Screenshot {

    public static void main(String[] args) {

        WebDriver driver = new EdgeDriver();

        try {
            driver.get("https://www.google.co.in");
            driver.manage().window().maximize();

            TakesScreenshot ts = (TakesScreenshot)driver;
            File source = ts.getScreenshotAs(OutputType.FILE);

            File destination = new File("Screenshot.png");
            FileUtils.copyFile(source,destination);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally {
            driver.quit();
        }
    }
}
