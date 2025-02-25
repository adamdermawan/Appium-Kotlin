package tests

import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.android.options.UiAutomator2Options
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import java.io.File
import java.net.URL
import java.time.Duration


open class AppiumAbstract {
    lateinit var driver: AndroidDriver

    @BeforeEach
    fun setUp() {
        //you can change the file if you want to try tinder
        val apk = "Bumble.apk"

        val classpathRoot = File(System.getProperty("user.dir"))
        val appDir = File(classpathRoot, "src/test/resources/apps/")
        val app = File(appDir, apk)

        val options = UiAutomator2Options()
            .setPlatformName("Android")
            .setAutomationName("UiAutomator2")
            .setPlatformVersion("13.0.0")
            .setDeviceName("emulator-5554")
            .setApp(app.absolutePath)
            .setAvdReadyTimeout(Duration.ofSeconds(5))
            .setAvdLaunchTimeout(Duration.ofSeconds(5))

        driver = AndroidDriver(
            URL("http://localhost:4723/"),
            options
        )
    }

    @AfterEach
    fun tearDown() {
        driver.quit()
    }
}