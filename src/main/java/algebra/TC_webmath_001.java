package algebra;

import java.io.FileInputStream;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import jxl.Cell;
import jxl.Range;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.read.biff.PasswordException;

public class TC_webmath_001 {

	public static void main(String[] args) {
		WebDriver driver = WebDriverManager.chromedriver().create();
		try {
			FileInputStream f = new FileInputStream("D:\\ExcelR Webmath Project\\Algebra.xls");

			Workbook wb = Workbook.getWorkbook(f);

			Sheet s = wb.getSheet("TC_webmath_001");

			driver.get(s.getCell(1, 0).getContents());

			Thread.sleep(2000);
			driver.manage().window().maximize();
		} catch (Exception e) {
			System.out.println("Sorry we cannot process this request");
		} finally {
			driver.close();
		}
	}

}
