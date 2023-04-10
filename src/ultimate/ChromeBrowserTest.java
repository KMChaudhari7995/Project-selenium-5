package ultimate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {
    static String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
    static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();//launch the browser
        driver.get(baseUrl);// Open the url in the Chrome browser
        driver.manage().window().maximize();//maximize the window
        System.out.println("Print Title :" + driver.getTitle());// print the title
        System.out.println("Print current URL: " + driver.getCurrentUrl());//Print current Url
        System.out.println("Print PageSource :" + driver.getPageSource());//Print PageSource
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));////we give Implicit wait to driver
        driver.findElement(By.id("user[email]")).sendKeys("Chaudhari Khushbu");//find id in username
        driver.findElement(By.name("user[password]")).sendKeys("12345");//find name in password
        driver.close(); //closing the chrome
    }

}
