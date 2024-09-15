package simplifying_expressions;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import jxl.Sheet;
import jxl.Workbook;

public class TC_webmath_012 {

	public static void main(String[] args) {
		WebDriver driver = WebDriverManager.chromedriver().create();
		try {
			FileInputStream f = new FileInputStream("D:\\ExcelR Webmath Project\\Simplifying_Expressions.xls");

			Workbook wb = Workbook.getWorkbook(f);

			Sheet s = wb.getSheet("TC_webmath_012");

			driver.get(s.getCell(1, 0).getContents());
			Thread.sleep(2000);
			driver.manage().window().maximize();

			driver.findElement(By.linkText(s.getCell(1, 1).getContents())).click();
			Thread.sleep(2000);

			boolean products = driver.findElement(By.linkText(s.getCell(1, 2).getContents())).isDisplayed();
			if (products == true) {
				System.out.println(s.getCell(1, 3).getContents());
			} else {
				System.out.println(s.getCell(1, 4).getContents());
			}
		} catch (Exception e) {
			System.out.println("Sorry we cannot process this request");

		} finally {
			driver.close();
		}
	}
}
