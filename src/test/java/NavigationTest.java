import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class NavigationTest extends BaseTest{

    @Test
    public void navigationTest() throws InterruptedException {
        driver.navigate().to("https://the-internet.herokuapp.com/");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("#content > ul > li:nth-child(11) > a")).click();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(3000);
    }

    @Test
    public void titleAndUrlTest(){
        driver.navigate().to("https://google.com");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
    }
}
