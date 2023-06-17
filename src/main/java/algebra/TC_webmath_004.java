package algebra;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import jxl.Sheet;
import jxl.Workbook;

public class TC_webmath_004 {

	public static void main(String[] args) {
		WebDriver driver = WebDriverManager.chromedriver().create();
		try {
			FileInputStream f = new FileInputStream("D:\\ExcelR Webmath Project\\Algebra.xls");

			Workbook wb = Workbook.getWorkbook(f);

			Sheet s = wb.getSheet("TC_webmath_004");

			driver.get(s.getCell(1, 0).getContents());
			Thread.sleep(2000);
			driver.manage().window().maximize();

			boolean text = driver.findElement(By.xpath(s.getCell(1, 1).getContents())).isDisplayed();
			if (text == true) {
				System.out.println(s.getCell(1, 2).getContents());
			} else {
				System.out.println(s.getCell(1, 3).getContents());
			}

			boolean go = driver.findElement(By.xpath(s.getCell(1, 4).getContents())).isDisplayed();
			if (go == true) {
				System.out.println(s.getCell(1, 5).getContents());
			} else {
				System.out.println(s.getCell(1, 6).getContents());
			}
		}

		catch (Exception e) {
			System.out.println("Sorry we cannot process this request");
		} finally {
			driver.close();
		}
	}

}
