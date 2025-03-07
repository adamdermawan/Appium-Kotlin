package tests

import io.appium.java_client.AppiumBy
import org.junit.jupiter.api.Test
import org.openqa.selenium.By
import org.openqa.selenium.Keys
import java.time.Duration

class SampleTest : AppiumAbstract() {

    fun delay(delay: Long){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(delay))
    }

    @Test
    fun fillFormComponent() {
        // ./gradlew test

        delay(10)
        val form = driver.findElement(AppiumBy.accessibilityId("Forms"))
        form.click()

        val inputField = driver.findElement(AppiumBy.accessibilityId("text-input"))
        val someNote = driver.findElement(AppiumBy.accessibilityId("input-text-result"))
        val switch = driver.findElement(AppiumBy.accessibilityId("switch"))
        //dropdown
        val activeButton = driver.findElement(By.
        xpath("//android.widget.TextView[@text='Active']"))

        form.click()
        inputField.sendKeys("Sulthan Tampan Sekaleee")
        someNote.click()
        //someNote.sendKeys("Babang Sulthan tampan sekaleee")
        switch.click()
        activeButton.click()

        //I am Handsome
        //i the greatest hehehehe


    }

}