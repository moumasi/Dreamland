package dream_Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;


public class dream_base {
	
	    public static WebDriver driver;
	    public static Properties drepro;
	
	public dream_base() {
		try {
			FileInputStream drfle = new FileInputStream(System.getProperty("user.dir")+("//src//test//java//dream_Config//dream_Config.properties"));
			   drepro = new Properties();
			   drepro.load(drfle);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
   public void dreBrowser() {
	  String dreAllbrowser = drepro.getProperty("Dbrowser1");
	  if(dreAllbrowser.equalsIgnoreCase("Chrome")) {
		  System.setProperty("Webdriver.chrome.driver", System.getProperty("user.dir")+ ("//Dreamland//Dream_ChromeDriver//chrome.exe"));
		  ChromeOptions naz= new ChromeOptions();
		  naz.addArguments("--remote-allow-origins=*");
		  
		  driver= new ChromeDriver();
		  
		  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));   
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
		  driver.manage().window().maximize(); 
	      }
	  else if(dreAllbrowser.equalsIgnoreCase("Edge")) {
		  System.setProperty("Webdriver.edge.driver", System.getProperty("user.dir")+ ("//Dreamland//Dream_EdgeDriver//msedgedriver.exe"));
		  EdgeOptions naz= new EdgeOptions();
		  naz.addArguments("--remote-allow-origins=*");
		  
		  driver= new EdgeDriver(); 
				  
		  
		  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(dream_utiliti.pageLoadTimeout));   
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(dream_utiliti.implicitlyWait)); 
		  driver.manage().window().maximize(); 
	      }
      }
     public static void DRlaunchurl(String url) {
    	 driver.get( drepro.getProperty("Durl2"));
     }
     
   }
	
	
	

