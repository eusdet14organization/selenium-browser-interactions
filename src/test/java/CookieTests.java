import org.junit.jupiter.api.Test;
import org.openqa.selenium.Cookie;

public class CookieTests extends BaseTest {

    @Test
    void cookieTest(){
        driver.get("http://www.example.com");
        driver.manage().addCookie(new Cookie("key","Cookie value"));
        Cookie cookie = driver.manage().getCookieNamed("key");
        System.out.println(cookie);
    }
}