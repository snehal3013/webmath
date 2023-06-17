package math_homework_help;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_webmath_065 {

	public static void main(String[] args) {
		WebDriver driver = WebDriverManager.chromedriver().create();
		try {
			driver.get("https://www.webmath.com/");
			Thread.sleep(2000);
			driver.manage().window().maximize();

			driver.findElement(By.linkText("Algebra")).click();
			Thread.sleep(2000);

			driver.findElement(By.linkText("Cosmeo")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println("Sorry we cannot process this request");

		} finally {
			driver.close();
		}
	}

}
