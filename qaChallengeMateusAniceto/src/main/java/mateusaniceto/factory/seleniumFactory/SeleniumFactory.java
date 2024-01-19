package mateusaniceto.factory.seleniumFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;
import java.util.Set;

public class SeleniumFactory {
    public static WebDriver driver;
    public static WebDriverWait wait;
    public static Actions action;
    public static String mainWindowHandle;

    public void initBrowser(String url) {
        String caminhoDriver = "driver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", caminhoDriver);

        ChromeOptions options = new ChromeOptions();

        String caminhoAdblockExtension = "src/extensions/Adblock.crx";

        options.addExtensions(new File(caminhoAdblockExtension));

        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        action = new Actions(driver);

        mainWindowHandle = driver.getWindowHandle();

        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        switchToNewTab();

        switchToMainContent();

        driver.get(url);

        driver.manage().window().maximize();
    }

    public void switchToMainContent() {
        driver.switchTo().window(mainWindowHandle);
    }

    public void switchToNewTab() {
        Set<String> allWindowHandles = driver.getWindowHandles();

        allWindowHandles.remove(mainWindowHandle);

        driver.switchTo().window(allWindowHandles.iterator().next());
    }

    public void tearDown() {
        driver.quit();
    }
}
