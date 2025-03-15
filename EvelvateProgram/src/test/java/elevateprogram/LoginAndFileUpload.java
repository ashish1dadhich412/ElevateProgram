package elevateprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAndFileUpload {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/login");
        Thread.sleep(2000);

      
        WebElement usernameField = driver.findElement(By.id("username"));
        usernameField.sendKeys("tomsmith");

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("SuperSecretPassword!");

        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();

        Thread.sleep(5000);

        driver.get("https://the-internet.herokuapp.com/upload");
        Thread.sleep(2000);

        // File input field को locate करें और फाइल path दें
        WebElement fileInput = driver.findElement(By.id("file-upload"));
        fileInput.sendKeys("C:\\path\\to\\your\\file.png");  // अपना फाइल path दें

        WebElement uploadButton = driver.findElement(By.id("file-submit"));
        uploadButton.click();

      Thread.sleep(5000);

        driver.quit();
    }
}
