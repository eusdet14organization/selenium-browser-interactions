import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FrameTests extends BaseTest{

    @Test
    void iFrameTest(){
        driver.get("https://the-internet.herokuapp.com/iframe");

        driver.switchTo().frame("mce_0_ifr");

        WebElement textArea = driver.findElement(By.cssSelector("#tinymce p"));

        System.out.println(textArea.getText());

        driver.switchTo().parentFrame();

        WebElement iframeElement = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(iframeElement);
    }
}
