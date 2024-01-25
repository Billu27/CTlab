package saniya;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class git_login {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\student\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");

		WebDriver drive = new ChromeDriver();
		
		//to find website
		drive.navigate().to("https://github.com/");
		
		//to find signin - bcoz signin is a text  with link
		drive.findElement(By.linkText("Sign in")).click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//to login - username. email
		drive.findElement(By.name("login")).sendKeys("Billu27",Keys.TAB);
		
		//password
		drive.findElement(By.name("password")).sendKeys("gitHUB2435",Keys.ENTER);
		
		//to wait
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//new repo
		drive.findElement(By.linkText("New")).click();
		
		drive.findElement(By.id(":r3:")).sendKeys("newrep",Keys.ENTER);
		
		//to wait
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		drive.findElement(By.xpath("/html/body/div[1]/div[6]/main/react-app/div/form/div[5]/button")).click();
	}	

}
