package pink.nico.omocha.headlesschromeselenide;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HeadlessChromeSelenideApplicationTests {

	@Before
	public void before(){
		// OSのデフォルトパスなら設定不要。モロに環境差異なのでそれで避けたい。
		// System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");

		// 参考：http://backpaper0.github.io/ghosts/try-selenide/#66
        Configuration.remote = "http://idcf.ykon.me:4444/wd/hub";
//        サイズ指定するとコケる（なぜ？
//		Configuration.browserSize = "1366x768";
		Configuration.browser = "chrome";
	}

	@Test
	public void googleTest() {

		// googleトップページを開く
		open("https://www.google.co.jp/");
		$("#lst-ib").val("selenide").pressEnter();

		// 検索結果ページ
		$(By.linkText("Selenide: concise UI tests in Java")).click();

		// Selenide公式ページ
		$("body").shouldHave(text("What is Selenide?"));

		screenshot("saved");
	}

}
