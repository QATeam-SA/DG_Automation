package DG_base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class DG_Url {
	WebDriver driver = Instance.getInstance();
	
 Properties prop = PropertiesFile.readPropertyFile("DG_Url.properties");
}
