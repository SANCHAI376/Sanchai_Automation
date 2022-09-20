package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class signin {
    @Test
    public void signin() throws InterruptedException



   {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver","C:\\Users\\sanchai.r\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Landingpage landingpage = new Landingpage(driver);
        String name =  "sanchai";
        String password = "@132321q";
        
        landingpage.goTo();
        landingpage.loginpage(name, password);
        
    }
    @Test
    public void signin2() throws InterruptedException
    {
        String name =  "sr";
        String password = "";
        WebDriver driver = new ChromeDriver();
        Landingpage landingpage = new Landingpage(driver);
        landingpage.goTo();
        landingpage.Wronguser(name,password);
        
    }
    
    @Test
    public void signin3() throws InterruptedException {
    	String name =  "srrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr";
        String password = "@132321q";
        WebDriver driver = new ChromeDriver();
        Landingpage landingpage = new Landingpage(driver);
        landingpage.goTo();
        landingpage.Wrong(name,password);
    	
    }
    @Test
    public void signin4() throws InterruptedException
    {
        String name =  "";
        String password = "";
        WebDriver driver = new ChromeDriver();
        Landingpage landingpage = new Landingpage(driver);
        landingpage.goTo();
        landingpage.blank(name,password);
        
    }
    @Test
    public void signin5() throws InterruptedException
    {
        String name =  "srsdgd";
        String password = "@132321q";
        WebDriver driver = new ChromeDriver();
        Landingpage landingpage = new Landingpage(driver);
        landingpage.goTo();
        landingpage.invalid(name,password);
        
    }
 
        
    
}
