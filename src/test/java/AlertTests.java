import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class AlertTests extends BaseTest{

    @Test
    void jsAlertTest() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(1000);
        Assertions.assertEquals("I am a JS Alert", alert.getText());
        alert.accept();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
        alert = driver.switchTo().alert();
        alert.dismiss();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
        alert = driver.switchTo().alert();
        alert.sendKeys("SDET testing");
        Thread.sleep(1000);
        alert.accept();

        WebElement resultText = driver.findElement(By.id("result"));

        Assertions.assertEquals("You entered: SDET testing", resultText.getText());
    }
}
