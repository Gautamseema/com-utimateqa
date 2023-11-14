package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/**
 * BaseUrl = https://courses.ultimateqa.com/
 * 1. Setup chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current url.
 * 5. Print the page source.
 * 6. Click on ‘Sign In’ link
 * 7. Print the current url
 * 8. Enter the email to email field.
 * 9. Enter the password to password field.
 * 10. Click on Login Button.
 * 11. Navigate to baseUrl.
 * 12. Navigate forward to Homepage.
 * 13. Navigate back to baseUrl.
 * 14. Refresh the page.
 * 15. Close the browser.
 */

public class MultiBrowserTesting {
    public static void main(String[] args) {
       String baseUrl = "https://courses.ultimateqa.com/";
 // launch the browser
        WebDriver driver = new ChromeDriver();
 // Open the Url into browser
        driver.get(baseUrl);
 // Maximise the browser
        driver.manage().window().maximize();
 // Give Implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 // Get the title
        String title = driver.getTitle();
        System.out.println(title);
 // Get the current Url
        System.out.println("The current Url : " + driver.getCurrentUrl());
 // Get the page source
        String p = driver.getPageSource();
        System.out.println("Page source is : " + p);
 // Click on sign in button
        WebElement signInButton = driver.findElement(By.xpath("//a[normalize-space()='Sign In']"));
        signInButton.click();
 // Print the current Url
        System.out.println("Current Url after clicking signInButton : " + driver.getCurrentUrl());
 // Find emailField element and type the email
        WebElement emailField = driver.findElement(By.id("user[email]"));
        emailField.sendKeys("prime123@gmail.com");
 // Find passwordField element and type the password
        WebElement passwordField = driver.findElement(By.name("user[password]"));
        passwordField.sendKeys("Prime123");
 // Click on loginButton
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
 // Navigate to baseUrl
        driver.navigate().to(baseUrl);
 // Navigate to forward to Homepage
        driver.navigate().forward();
 // Navigate back to baseUrl
        driver.navigate().back();
 // Refresh the page
       driver.navigate().refresh();
 // Navigate to baseUrl
       driver.navigate().to(baseUrl);
 // Close the browser
        driver.quit();
    }
}
