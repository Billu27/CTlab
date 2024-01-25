package saniya;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xav_login {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\student\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		//to go the web site
		driver.navigate().to("http://10.0.0.20/userlogin/index.html");
		//to put user name
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr[2]/td/form/table/tbody/tr[1]/td[2]/input")).sendKeys("student",Keys.TAB);
		// to enter password
		driver.findElement(By.id("passwd")).sendKeys("student",Keys.ENTER);

	}

}
