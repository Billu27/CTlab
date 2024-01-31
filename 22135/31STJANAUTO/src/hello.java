import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
	
public class hello {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			
		driver.navigate().to("https://www.techlistic.com/p/selenium-practice-form.html");
		
		
		
		//fristname
		driver.findElement(By.name("firstname")).sendKeys("Minney",Keys.TAB);
		
		//last name
		driver.findElement(By.name("lastname")).sendKeys("Mouse",Keys.TAB);
		
		driver.findElement(By.id("sex-1")).click();

		}

	}

