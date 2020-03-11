import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HabrTest {


    WebDriver driver;
    HabrMainPage HabrMainPage;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Webdrivers\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.get("https://habr.com/ru/");
        HabrMainPage = new HabrMainPage(driver);
    }

    @Test
    public void QtyOfElements() {
        HabrMainPage.clickSearchButton();
        HabrMainPage.sendSearchField();
        HabrMainPage.pressEnterButtonForSearchField();
//        List<WebElement> ElementsFromFirstPage = driver.findElements(By.xpath("//*[contains(text(), 'Selenium')]//ancestor::li"));
        List<WebElement> ElementsFromFirstPage = driver.findElements(By.xpath("//*[text()[contains(., 'мультиплатформенного')]]"));
//        List<WebElement> ElementsFromFirstPage = driver.findElements(By.partialLinkText("мультиплатформенного"));
        int Size = ElementsFromFirstPage.size();
        String SizeOfLinks = Integer.toString(Size);
        Assert.assertEquals("1", SizeOfLinks);
    }



    @After
    public void tearDown() {
        driver.quit();
    }
}
