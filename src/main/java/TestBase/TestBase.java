package TestBase;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Parameters;

import com.fc.Pagelayer.com.fullCreative.BoardPage;
import com.fc.Pagelayer.com.fullCreative.HomePage;
import com.fc.Pagelayer.com.fullCreative.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;



public class TestBase 
{
	public static WebDriver driver;
	public HomePage Home ;
	public LoginPage Login ;
	public BoardPage Board;
	
	
	//@Parameters("browser")
	@BeforeMethod
	public void setUp(String br)
	{	
		if(br.equalsIgnoreCase("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(br.equalsIgnoreCase("Firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(br.equalsIgnoreCase("Edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else
		{
			System.out.println("Please provide correct browser name");
		}
		
		//URL Details, Cookies, Implicitly Wait
		driver.get("https://trello.com/home");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		//------------------- Object Creation ----------------------------
		Home = new HomePage();
		Login = new LoginPage();
		Board = new BoardPage();
		
		
		
		
		
	}
	
	@AfterMethod
	public void tearDown()
	{
//		driver.quit();
	}
}
