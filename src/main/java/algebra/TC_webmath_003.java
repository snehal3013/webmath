package algebra;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import jxl.Sheet;
import jxl.Workbook;

public class TC_webmath_003 {

	public static void main(String[] args) {
		WebDriver driver = WebDriverManager.chromedriver().create();
		try {
			FileInputStream f = new FileInputStream("D:\\ExcelR Webmath Project\\Algebra.xls");

			Workbook wb = Workbook.getWorkbook(f);

			Sheet s = wb.getSheet("TC_webmath_003");

			driver.get(s.getCell(1, 0).getContents());
			Thread.sleep(2000);
			driver.manage().window().maximize();

			boolean home = driver.findElement(By.linkText(s.getCell(1, 1).getContents())).isEnabled();
			if (home == true) {
				System.out.println(s.getCell(1, 2).getContents());
			} else {
				System.out.println(s.getCell(1, 3).getContents());
			}

			boolean math_for_everyone = driver.findElement(By.linkText(s.getCell(1, 4).getContents())).isEnabled();
			if (math_for_everyone == true) {
				System.out.println(s.getCell(1, 5).getContents());
			} else {
				System.out.println(s.getCell(1, 6).getContents());
			}

			boolean general_math = driver.findElement(By.linkText(s.getCell(1, 7).getContents())).isEnabled();
			if (general_math == true) {
				System.out.println(s.getCell(1, 8).getContents());
			} else {
				System.out.println(s.getCell(1, 9).getContents());
			}

			boolean k8math = driver.findElement(By.linkText(s.getCell(1, 10).getContents())).isEnabled();
			if (k8math == true) {
				System.out.println(s.getCell(1, 11).getContents());
			} else {
				System.out.println(s.getCell(1, 12).getContents());
			}

			boolean algebra = driver.findElement(By.linkText(s.getCell(1, 13).getContents())).isEnabled();
			if (algebra == true) {
				System.out.println(s.getCell(1, 14).getContents());
			} else {
				System.out.println(s.getCell(1, 15).getContents());
			}

			boolean plots_geometry = driver.findElement(By.linkText(s.getCell(1, 16).getContents())).isEnabled();
			if (plots_geometry == true) {
				System.out.println(s.getCell(1, 17).getContents());
			} else {
				System.out.println(s.getCell(1, 18).getContents());
			}

			boolean trig_Calculus = driver.findElement(By.linkText(s.getCell(1, 19).getContents())).isEnabled();
			if (trig_Calculus == true) {
				System.out.println(s.getCell(1, 20).getContents());
			} else {
				System.out.println(s.getCell(1, 21).getContents());
			}

			boolean otherstuff = driver.findElement(By.linkText(s.getCell(1, 22).getContents())).isEnabled();
			if (otherstuff == true) {
				System.out.println(s.getCell(1, 23).getContents());
			} else {
				System.out.println(s.getCell(1, 24).getContents());
			}

		} catch (Exception e) {
			System.out.println("Sorry we cannot process this request");
		} finally {
			driver.close();
		}
	}
}
