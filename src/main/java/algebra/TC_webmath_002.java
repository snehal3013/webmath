package algebra;

import java.io.FileInputStream;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import jxl.Sheet;
import jxl.Workbook;

public class TC_webmath_002 {

	public static void main(String[] args) {
		WebDriver driver = WebDriverManager.chromedriver().create();
		try {
			FileInputStream f = new FileInputStream("D:\\ExcelR Webmath Project\\Algebra.xls");

			Workbook wb = Workbook.getWorkbook(f);

			Sheet s = wb.getSheet("TC_webmath_002");

			driver.get(s.getCell(1, 0).getContents());
			Thread.sleep(2000);
			driver.manage().window().maximize();

			List<WebElement> tabs = driver.findElements(By.tagName(s.getCell(1, 1).getContents()));
			Thread.sleep(2000);

			for (int i = 0; i <= tabs.size(); i++) {
				System.out.println(tabs.get(i).getText());
				if (tabs.get(i).getText().equals(s.getCell(1, 2).getContents())) {
					break;

				}
			}
		}

		catch (Exception e) {
			System.out.println("Sorry we cannot process this request");
		} finally {
			driver.close();
		}
	}
}
