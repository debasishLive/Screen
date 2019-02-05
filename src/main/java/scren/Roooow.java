package scren;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Roooow {

	@Test
	public void demorun() throws Exception {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in");
		// This code will capture screenshot of current screen
		BufferedImage image = new Robot()
				.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));

		// This will store screenshot on Specific location
		ImageIO.write(image, "png", new File(System.getProperty("user.dir")+"/rslt/"+LocalDateTime.now()+".png"));
		System.out.println("Screenshot"+System.getProperty("user.dir")+"/rslt/"+LocalDateTime.now()+".png");
		driver.close();

	}

}
