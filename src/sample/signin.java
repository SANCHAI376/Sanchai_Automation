package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class signin {
    @Test
    public void signin() throws InterruptedException




{
    	  System.setProperty("webdriver.chrome.driver","C:\\Users\\sanchai.r\\Downloads\\chromedriver_win32\\chromedriver.exe");
      
        WebDriver driver = new ChromeDriver();
        Landingpage landingpage = new Landingpage(driver);
        String name =  "sanchai";
        String password = "san@123";
        landingpage.goTo();
        landingpage.character3(name, password);
       
        
        Thread.sleep(2000);
        driver.close();
    }
    @Test
    public void signin2() throws InterruptedException
    {
        String name =  "sanchai";
        String password = "";
        WebDriver driver = new ChromeDriver();
        Landingpage landingpage = new Landingpage(driver);
        landingpage.goTo();
        landingpage.character20(name, password);
        landingpage.goTo();
        landingpage.character3(name, password);
        String ExpectedURL="Error message should shown";
        String ActualURL="driver.getCurrentURL";
        Assert.assertEquals(ActualURL, ExpectedURL);
        Thread.sleep(2000);
        driver.close();
    }
    @Test
    public void signin3() throws InterruptedException
    {
        String name =  "kk";
        String password = "";
        WebDriver driver = new ChromeDriver();
        Landingpage landingpage = new Landingpage(driver);
        landingpage.goTo();
        landingpage.character2(name, password);
        landingpage.goTo();
        landingpage.character3(name, password);
        String ExpectedURL="Error message should shown";
        String ActualURL="driver.getCurrentURL";
        Assert.assertEquals(ActualURL, ExpectedURL);
        Thread.sleep(2000);
        driver.close();
        
    }
    @Test
    public void signin4() throws InterruptedException
    {
        String name =  "abcdefghijklmnopqrstu";
        String password = "";
        WebDriver driver = new ChromeDriver();
        Landingpage landingpage = new Landingpage(driver);
        landingpage.goTo();
        landingpage.character21(name, password);
        landingpage.goTo();
        landingpage.character3(name, password);
        String ExpectedURL="Error message should shown";
        String ActualURL="driver.getCurrentURL";
        Assert.assertEquals(ActualURL, ExpectedURL);
        Thread.sleep(2000);
        driver.close();
    }
    @Test
    public void signin5() throws InterruptedException
    {
        String name =  "";
        String password = "";
        WebDriver driver = new ChromeDriver();
        Landingpage landingpage = new Landingpage(driver);
        landingpage.goTo();
        landingpage.validemail(name, password);
        landingpage.goTo();
        landingpage.character3(name, password);
        String ExpectedURL="Error message should shown";
        String ActualURL="driver.getCurrentURL";
        Assert.assertEquals(ActualURL, ExpectedURL);
        Thread.sleep(2000);
        driver.close();
    }
    @Test
    public void signin6() throws InterruptedException
    {
        String name =  "sa@gmail.com";
        String password = "";
        WebDriver driver = new ChromeDriver();
        Landingpage landingpage = new Landingpage(driver);
        landingpage.goTo();
        landingpage.unregisteremail(name, password);
        landingpage.goTo();
        landingpage.character3(name, password);
        String ExpectedURL="Error message should shown";
        String ActualURL="driver.getCurrentURL";
        Assert.assertEquals(ActualURL, ExpectedURL);
        Thread.sleep(2000);
        driver.close();
    }
    @Test
    public void signin7() throws InterruptedException
    {
        String name =  "sanchai";
        String password = "san@123";
        WebDriver driver = new ChromeDriver();
        Landingpage landingpage = new Landingpage(driver);
        landingpage.goTo();
        landingpage.validdetails(name, password);
        landingpage.goTo();
        landingpage.character3(name, password);
        String ExpectedURL="Error message should shown";
        String ActualURL="driver.getCurrentURL";
        Assert.assertEquals(ActualURL, ExpectedURL);
        Thread.sleep(2000);
        driver.close();
    }
    @Test
    public void signin8() throws InterruptedException
    {
        String name =  "san";
        String password = "acd";
        WebDriver driver = new ChromeDriver();
        Landingpage landingpage = new Landingpage(driver);
        landingpage.goTo();
        landingpage.pass2(name, password);
        landingpage.goTo();
        landingpage.character3(name, password);
        String ExpectedURL="Error message should shown";
        String ActualURL="driver.getCurrentURL";
        Assert.assertEquals(ActualURL, ExpectedURL);
        Thread.sleep(2000);
        driver.close();
    }
    
}
