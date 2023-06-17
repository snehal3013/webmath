package word_problems;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import jxl.Sheet;
import jxl.Workbook;

public class TC_webmath_039 {

	public static void main(String[] args) {
		WebDriver driver = WebDriverManager.chromedriver().create();
		try {
			FileInputStream f = new FileInputStream("D:\\ExcelR Webmath Project\\Word_Problems.xls");
			Workbook wb = Workbook.getWorkbook(f);

			Sheet s = wb.getSheet("TC_webmath_039");

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

			driver.findElement(By.xpath(s.getCell(1, 6).getContents())).sendKeys(s.getCell(1, 7).getContents());
			Thread.sleep(2000);

			driver.findElement(By.xpath(s.getCell(1, 8).getContents())).sendKeys(s.getCell(1, 9).getContents());
			Thread.sleep(2000);

			driver.findElement(By.xpath(s.getCell(1, 10).getContents())).click();
			Thread.sleep(2000);

			driver.findElement(By.xpath(s.getCell(1, 11).getContents())).click();
			Thread.sleep(2000);

			driver.findElement(By.xpath(s.getCell(1, 12).getContents())).sendKeys(s.getCell(1, 13).getContents());
			Thread.sleep(2000);

			driver.findElement(By.xpath(s.getCell(1, 14).getContents())).sendKeys(s.getCell(1, 15).getContents());
			Thread.sleep(2000);

			driver.findElement(By.xpath(s.getCell(1, 16).getContents())).click();
			Thread.sleep(2000);

			driver.findElement(By.xpath(s.getCell(1, 17).getContents())).click();
			Thread.sleep(2000);

			driver.findElement(By.xpath(s.getCell(1, 18).getContents())).sendKeys(s.getCell(1, 19).getContents());
			Thread.sleep(2000);

			driver.findElement(By.xpath(s.getCell(1, 20).getContents())).sendKeys(s.getCell(1, 21).getContents());
			Thread.sleep(2000);

			driver.findElement(By.xpath(s.getCell(1, 22).getContents())).click();
			Thread.sleep(2000);

			driver.findElement(By.xpath(s.getCell(1, 23).getContents())).click();
			Thread.sleep(2000);

			driver.findElement(By.xpath(s.getCell(1, 24).getContents())).sendKeys(s.getCell(1, 25).getContents());
			Thread.sleep(2000);

			driver.findElement(By.xpath(s.getCell(1, 26).getContents())).sendKeys(s.getCell(1, 27).getContents());
			Thread.sleep(2000);

			driver.findElement(By.xpath(s.getCell(1, 28).getContents())).click();
			Thread.sleep(2000);

			driver.findElement(By.xpath(s.getCell(1, 29).getContents())).click();
			Thread.sleep(2000);

			driver.findElement(By.xpath(s.getCell(1, 30).getContents())).sendKeys(s.getCell(1, 31).getContents());
			Thread.sleep(2000);

			driver.findElement(By.xpath(s.getCell(1, 32).getContents())).sendKeys(s.getCell(1, 33).getContents());
			Thread.sleep(2000);

			driver.findElement(By.xpath(s.getCell(1, 34).getContents())).click();
			Thread.sleep(2000);

			WebElement f1 = driver.findElement(By.name(s.getCell(1, 35).getContents()));

			driver.switchTo().frame(f1);
			Thread.sleep(2000);

			if (driver.getPageSource().contains(s.getCell(1, 36).getContents())) {
				System.out.println(s.getCell(1, 37).getContents());
			} else {
				System.out.println(s.getCell(1, 38).getContents());
			}
		} catch (Exception e) {
			System.out.println("Sorry we cannot process this request");

		} finally {
			driver.close();
		}

	}

}
