package DG_testcases;

import java.util.Properties;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import DG_base.Instance;
import DG_base.PropertiesFile;

public class Sign_In {
	WebDriver driver = Instance.getInstance();
	 Properties prop = PropertiesFile.readPropertyFile("DG_Url.properties");
	 Logger logger = LogManager.getLogger(Sign_In.class);

	 public void Login() throws InterruptedException {
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.get(prop.getProperty("baseURL"));
			Thread.sleep(5000);		
	}

}
