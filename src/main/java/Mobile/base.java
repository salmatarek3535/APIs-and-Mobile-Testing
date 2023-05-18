package Mobile;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class base {

    public static void main(String[] args) throws MalformedURLException
    {
        File appdir = new File("src");
        File app = new File(appdir,"ApiDemos-debug.apk");
        DesiredCapabilities capabilities= new DesiredCapabilities();
        capabilities.setCapability("deviceName","Salma_1");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("platformVersion","8.0.0");
        capabilities.setCapability("App", app.getAbsolutePath());


        AndroidDriver<AndroidElement> androidDriver= new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

    }


}
