package tests

import io.appium.java_client.android.AndroidDriver
import org.openqa.selenium.By
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait
import java.time.Duration

class waitUtil {

    fun AndroidDriver.waitUntilElementPresent(by: By, timeoutSeconds: Long = 40): WebElement {
        val wait = WebDriverWait(this, Duration.ofSeconds(timeoutSeconds))
        return wait.until(ExpectedConditions.presenceOfElementLocated(by))
    }

    // Wait for element to be visible (present and displayed)
    fun AndroidDriver.waitForElementVisible(by: By, timeoutSeconds: Long = 40): WebElement {
        val wait = WebDriverWait(this, Duration.ofSeconds(timeoutSeconds))
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by))
    }

    // Wait for element to be clickable
    fun AndroidDriver.waitForElementClickable(by: By, timeoutSeconds: Long = 40): WebElement {
        val wait = WebDriverWait(this, Duration.ofSeconds(timeoutSeconds))
        return wait.until(ExpectedConditions.elementToBeClickable(by))
    }

    // Wait for element to disappear/not visible
    fun AndroidDriver.waitForElementInvisible(by: By, timeoutSeconds: Long = 40): Boolean {
        val wait = WebDriverWait(this, Duration.ofSeconds(timeoutSeconds))
        return wait.until(ExpectedConditions.invisibilityOfElementLocated(by))
    }

    // Generic wait with custom condition
    fun <T> AndroidDriver.waitUntil(condition: () -> T?, timeoutSeconds: Long = 40): T? {
        val wait = WebDriverWait(this, Duration.ofSeconds(timeoutSeconds))
        return wait.until { condition() }
    }
}