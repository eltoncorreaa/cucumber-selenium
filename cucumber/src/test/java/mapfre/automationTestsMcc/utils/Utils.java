package mapfre.automationTestsMcc.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.IOUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Quando;
import mapfre.automationTestsMcc.utils.config.Config;

public class Utils {

	public WebDriver driver;

	public Utils() {
		driver = Config.driver;
	}

	Scenario scenario;

	@Before
	public void before(Scenario scenario) {
		this.scenario = scenario;
	}

	public WebDriver reloadDriver() {
		if (this.driver == null) {
			this.driver = Config.driver;
		}
		return this.driver;
	}

	@Quando("^tiro um print screen com altura \"(.*?)\" e largura \"(.*?)\"$")
	public void tiro_um_print_screen_na_com_altura_e_largura(String height, String width) throws Throwable {
		// muda resolucao
		reloadDriver();
		driver.manage().window().setSize(new Dimension(Integer.valueOf(width), Integer.valueOf(height)));

		tiro_um_print_screen();

		int screenshootWidth = 1366;
		int screenshootheight = 768;

		// no final volta para resolucao antiga
		driver.manage().window().setSize(new Dimension(screenshootWidth, screenshootheight));
	}

	@Quando("^tiro um  print screen$")
	public void tiro_um_print_screen() throws Throwable {

		byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		String screenshotBase = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);

		String path = this.getClass().getProtectionDomain().getCodeSource().getLocation().getPath().replace("/target/test-classes/", "");
		String screenFileName = path + "/prints/MccAuto/screenShot" + getTimeSuffix() + ".png";
		FileOutputStream output = new FileOutputStream(new File(screenFileName));

		IOUtils.write(screenshot, output);

		Map<Object, Object> params = new HashMap<Object, Object>();
		params.put("image", screenshotBase);

		scenario.embed(screenshot, "image/png");
	}
	
	public void tirar_um_print_screen_impressao() throws Throwable {

		byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		String screenshotBase = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);

		String path = this.getClass().getProtectionDomain().getCodeSource().getLocation().getPath().replace("/target/test-classes/", "");
		String screenFileName = path + "/prints/MccAuto/screenShot" + getTimeSuffix() + ".png";
		FileOutputStream output = new FileOutputStream(new File(screenFileName));

		IOUtils.write(screenshot, output);

		Map<Object, Object> params = new HashMap<Object, Object>();
		params.put("image", screenshotBase);
	}

	private String getTimeSuffix() {
		DateFormat dateFormat = new SimpleDateFormat("HHmmss");

		return dateFormat.format(Calendar.getInstance().getTime());
	}

}
