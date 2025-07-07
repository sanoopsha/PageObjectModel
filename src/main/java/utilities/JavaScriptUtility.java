package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScriptUtility extends Utility {

    public static void scrollToElementJS(By locator){
        WebElement element = driver.findElement(locator);
        String jsScript = "arguments[0].scrollIntoView();";
        ((JavascriptExecutor)driver).executeScript(jsScript, element);
    }

    public static void clickJS(By locator){
        WebElement element = driver.findElement(locator);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].scrollIntoView();", element);
    }

    public static void setDateJS(By locator, String date){
        // Locate the date picker element
        WebElement dateElement = driver.findElement(locator);
        // Set a specific date using JavaScript
        String dateYMD = date; // Format: yyyy-MM-dd
        ((JavascriptExecutor) driver).executeScript("arguments[0].value=arguments[1];", dateElement, date);
    }


}
