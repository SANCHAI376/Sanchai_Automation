package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Landingpage {
    WebDriver driver;
    public Landingpage(WebDriver driver) {
        this.driver =driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "username")
    WebElement  username;
    
    @FindBy(id= "password")
    WebElement passwords;
    
    @FindBy(xpath= "//a[class='btn btn-primary btn-block']")
    WebElement select;
    
    @FindBy(xpath="//button[@type='submit']")
    WebElement Select;
    
    public void character3(String name, String password) {
        Select.click();
        username.sendKeys(name);
        passwords.sendKeys(password);
        driver.findElement(By.xpath("//a[@type='submit']")).click();
    }
    
    public void character20(String name, String password) {
        Select.click();
        username.sendKeys(name);
        passwords.sendKeys(password);
        driver.findElement(By.xpath("//a[@type='submit']")).click();
    
    }
    public void character2(String name,String password) {
        Select.click();
        username.sendKeys(name);
        passwords.sendKeys(password);
        driver.findElement(By.xpath("//a[@type='submit']")).click();
    
    }
    
    public void character21(String name,String password) {
        Select.click();
        username.sendKeys(name);
        passwords.sendKeys(password);
        driver.findElement(By.xpath("//a[@type='submit']")).click();
    }
    
    public void validemail(String name,String password) {
        Select.click();
        username.sendKeys(name);
        passwords.sendKeys(password);
        driver.findElement(By.xpath("//a[@type='submit']")).click();
    }
    public void unregisteremail(String name,String password) {
        Select.click();
        username.sendKeys(name);
        passwords.sendKeys(password);
        driver.findElement(By.xpath("//a[@type='submit']")).click();
    }
    public void validdetails(String name,String password) {
        Select.click();
        username.sendKeys(name);
        passwords.sendKeys(password);
        driver.findElement(By.xpath("//a[@type='submit']")).click();
    }
    public void pass2(String name,String password) {
        Select.click();
        username.sendKeys(name);
        passwords.sendKeys(password);
        driver.findElement(By.xpath("//a[@type='submit']")).click();
    }
    public void goTo() {
        driver.get(" https://mobileworld.banyanpro.com/");
    }
}
