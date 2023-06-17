package complex_numbers;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import jxl.Sheet;
import jxl.Workbook;

public class TC_webmath_035 {

	public static void main(String[] args) {
		WebDriver driver = WebDriverManager.chromedriver().create();
		try {
			FileInputStream f = new FileInputStream("D:\\ExcelR Webmath Project\\Complex_Numbers.xls");
			Workbook wb = Workbook.getWorkbook(f);

			Sheet s = wb.getSheet("TC_webmath_035");

			driver.get(s.getCell(1, 0).getContents());
			Thread.sleep(2000);
			driver.manage().window().maximize();

			driver.findElement(By.linkText(s.getCell(1, 1).getContents())).click();
			Thread.sleep(2000);

			boolean link = driver.findElement(By.linkText(s.getCell(1, 2).getContents())).isEnabled();

			if (link == true) {
				System.out.println(s.getCell(1, 3).getContents());
			} else {
				System.out.println(s.getCell(1, 4).getContents());
			}
			Thread.sleep(2000);
			driver.findElement(By.linkText(s.getCell(1, 5).getContents())).click();
			Thread.sleep(2000);

			driver.findElement(By.xpath(s.getCell(1, 6).getContents())).clear();
			Thread.sleep(2000);

			driver.findElement(By.xpath(s.getCell(1, 7).getContents())).sendKeys(s.getCell(1, 8).getContents());
			Thread.sleep(2000);

			driver.findElement(By.xpath(s.getCell(1, 9).getContents())).click();
			Thread.sleep(2000);

			WebElement f1 = driver.findElement(By.name(s.getCell(1, 10).getContents()));

			driver.switchTo().frame(f1);
			Thread.sleep(2000);

			if (driver.getPageSource().contains(s.getCell(1, 11).getContents())) {
				System.out.println(s.getCell(1, 12).getContents());
			} else {
				System.out.println(s.getCell(1, 13).getContents());
			}
		} catch (Exception e) {
			System.out.println("Sorry we cannot process this request");

		} finally {
			driver.close();
		}

	}

}
