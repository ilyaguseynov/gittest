import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HabrMainPage {

    private WebDriver driver;


    public static void main(String[] args) {

    }

    public HabrMainPage(WebDriver driver) {
        this.driver = driver;
    }





    ////////////////////////////////////////
    ////// Buttons /////////////////////////

    private By SearchButton = By.xpath("//button[@id='search-form-btn']");
    private By SearchField = By.xpath("//input[@id='search-form-field']");

    ////////////////////////////////////////
    ////// Clicks and inputs ///////////////

    public HabrMainPage clickSearchButton() {
        driver.findElement(SearchButton).click();
        return new HabrMainPage(driver);
    }

    public HabrMainPage sendSearchField() {
        driver.findElement(SearchField).sendKeys("автоматизированное тестирование");
        return new HabrMainPage(driver);
    }

    public HabrMainPage pressEnterButtonForSearchField() {
        driver.findElement(SearchField).sendKeys(Keys.ENTER);
        return new HabrMainPage(driver);
    }

//    public HabrMainPage ListOfElementsFromFirstPage(){
//    List<WebElement> ElementsFromFirstPage = driver.findElements(By.xpath("//*[contains(text(), 'Selenium')]//ancestor::li"));
//    System.out.println("NumberOfLinks: " + ElementsFromFirstPage.size());
//    return new HabrMainPage(driver);
//    }

}
