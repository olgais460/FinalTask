package task.UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AboutPage extends AbstractPage {
    WebElement orangeBtn = driver.findElement(By.xpath("//*[@id=\"top\"]/div[2]/div/section[1]/div/a"));
    WebElement header = driver.findElement(By.xpath("//*[@id=\"top\"]/div[2]/div/section[1]/div/h2"));
    WebElement subText = driver.findElement(By.xpath("//*[@id=\"top\"]/div[2]/div/section[1]/div/p"));

    // WebElement register = driver.findElement(By.xpath("//*[text()='Регистрация']"));
//WebElement enter= driver.findElement(By.xpath("//div[1]/div/div/div/div/div[2]/section[1]/label"));
    public AboutPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void clickOrangeButton() {
        orangeBtn.click();
    }

    public String getHeaderText() {
        return header.getText();
    }

    public String getSubText() {
        return subText.getText();
    }

}


