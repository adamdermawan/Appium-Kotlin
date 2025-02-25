package tests

import io.appium.java_client.AppiumBy
import org.junit.jupiter.api.Test
import org.openqa.selenium.By
import org.openqa.selenium.Keys

class SampleTest : AppiumAbstract() {

    @Test
    fun testSampleApp() {
        // Your test logic here
        // ./gradlew test

        val login = driver.findElement(AppiumBy.accessibilityId("input_email_or_phone_number"))
        val pass = driver.findElement(AppiumBy.accessibilityId("input_password"))
        val btnLogin = driver.findElement(AppiumBy.accessibilityId("button_login"))

        login.click()
        login.clear()
        login.sendKeys("...")

        pass.click()
        pass.clear()
        pass.sendKeys("...")

        btnLogin.click()

    }

}