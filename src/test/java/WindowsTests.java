import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;

import java.util.Set;

public class WindowsTests extends BaseTest{

    @Test
    void twoWindowsTest() throws InterruptedException {

        driver.get("https://the-internet.herokuapp.com/windows");

        String titleFirstWindow = driver.getTitle();
        System.out.println("Первое окно: " + titleFirstWindow);

        String firstWindowsHandle = driver.getWindowHandle();

        driver.findElement(By.cssSelector("#content > div > a")).click();
        Thread.sleep(2000);

        Set<String> windowHandles = driver.getWindowHandles();

        for(String tab: windowHandles){
            if(!tab.equals(firstWindowsHandle)){
                driver.switchTo().window(tab);
            }
        }
        System.out.println("Заголовок страницы: " + driver.getTitle());
    }

    @Test
    void newWindowTest(){
        driver.get("https://google.com");
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://selenium.dev");
    }

}
