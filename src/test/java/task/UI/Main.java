package task.UI;
//1. Открыть страницу https://dev-t.uxcrowd.ru/about"
//2.  наличие заголовка на странице;
//3. наличие тескста под заголовком;
//4. Нажать на кнопку "Попробовать бесплатно"

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class Main {
    private static final String URL="https://dev-t.uxcrowd.ru/about";
    private WebDriverWait wait;
    private WebDriver driver;

@Test
    public void start(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL);

    AboutPage aboutPage=new AboutPage(driver,wait);
    String headerText=aboutPage.getHeaderText();
    Assertions.assertTrue(headerText.contains("UXCrowd"),"The header contains wrong text");
String subText=aboutPage.getSubText();
    Assertions.assertTrue(subText.contains("Web, Android, iOS"),"The subheader contains wrong text");
    aboutPage.clickOrangeButton();
     wait = new WebDriverWait(driver, Duration.ofSeconds(7));

    }



    }

