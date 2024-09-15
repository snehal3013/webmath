package algebra;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import jxl.Sheet;
import jxl.Workbook;

public class TC_webmath_009 {

	public static void main(String[] args) {
		WebDriver driver = WebDriverManager.chromedriver().create();
		try {
			FileInputStream f = new FileInputStream("D:\\ExcelR Webmath Project\\Algebra.xls");

			Workbook wb = Workbook.getWorkbook(f);

			Sheet s = wb.getSheet("TC_webmath_009");

			driver.get(s.getCell(1, 0).getContents());
			Thread.sleep(2000);
			driver.manage().window().maximize();

			//algebra link
			driver.findElement(By.linkText(s.getCell(1, 1).getContents())).click();
			Thread.sleep(2000);

			//Help typing in your math problems link
			driver.findElement(By.linkText(s.getCell(1, 2).getContents())).click();
			Thread.sleep(2000);
			if (driver.getPageSource().contains(s.getCell(1, 3).getContents())) {
				System.out.println(s.getCell(1, 4).getContents());
			} else {
				System.out.println(s.getCell(1, 5).getContents());
			}
		}

		catch (Exception e) {
			System.out.println("");
		}

		finally {
			driver.close();
		}

	}

}
