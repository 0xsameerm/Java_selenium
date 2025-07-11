package Others;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("config.properties");
        Properties prop = new Properties();
        prop.load(fis);
        String browser = prop.getProperty("browser");
        System.out.println("Browser name is "+browser);
    }

}
