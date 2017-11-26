# やりたいこと

## 最終的には

**SelenideでHeadlessなブラウザ上でテストしたい**

さすればおのずとTravis等でCI可能となる

[Selenide～Javaで超簡単・簡潔にUIテストを書く～](http://qiita.com/tatesuke/items/589e30ab9b3dc7037e26#%E3%81%9D%E3%81%AE%E4%BB%96)

[SeleniumからHeadless Chromeを使ってみた - http://qiita.com](http://qiita.com/orangain/items/db4594113c04e8801aad)

## 技術要素
* 動作環境
  * https://hub.docker.com/r/justinribeiro/chrome-headless/
  * https://github.com/yukinying/chrome-headless-browser-docker#how-to-run-the-container-with-selenium  
    selenium server付きのheadless chrome container
* Seleniumコード
  * https://thefriendlytester.co.uk/2017/04/new-headless-chrome-with-selenium.html
* Chrome WebDriver
  * https://github.com/SeleniumHQ/selenium/wiki/ChromeDriver
* HeadlessChrome 引数  
  * http://vaaaaaanquish.hatenablog.com/entry/2017/06/06/194546
* FirefoxにもHeadless!!!
  * http://vaaaaaanquish.hatenablog.com/entry/2017/08/31/172020
