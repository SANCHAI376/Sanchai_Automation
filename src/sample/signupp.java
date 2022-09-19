package sample;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class signupp{
    WebDriver driver;
    @BeforeMethod
    public void verify( )
    {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\sanchai.r\\Downloads\\chromedriver_win32\\chromedriver.exe");
         driver = new ChromeDriver();
        
         driver.get("https://mobileworld.banyanpro.com/");
         driver.findElement(By.cssSelector("button[type='submit']")).click();
         driver.findElement(By.xpath("//a[normalize-space()='Sign up']")).click();
    }
         @Test(dataProvider = "datasets")
         public void testdata(String Fname,String Lname,String Email,String passwrd,String number,String date,String bio) throws InterruptedException
         {
         driver.findElement(By.cssSelector("#myName")).sendKeys(Fname);
      
         driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys(Lname);
         driver.findElement(By.cssSelector("input[placeholder='Enter Email']")).sendKeys(Email);
         driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(passwrd);
         driver.findElement(By.cssSelector("input[placeholder='91XXXXXXXXXX']")).sendKeys(number);
        
         driver.findElement(By.xpath("//input[@type='date']")).sendKeys(date);
         driver.findElement(By.xpath("//textarea[@placeholder='Short Bio']")).sendKeys(bio);
         driver.findElement(By.xpath("//div[@class='col-md-2']//input[@name='gender']")).click();
         driver.findElement(By.xpath("//button[@type='submit']")).click();
         driver.switchTo().alert().accept();
         Thread.sleep(2000);
         driver.quit();
         driver.close();
    }
         
        
    
    @DataProvider(name = "datasets")
    public Object[][] datasets(){
        Object[][] data = {{"sanchai","san","sanchai@gmail.com","san@123","1234567898","05/20/2022","qwertyuiopasdfghjkl"},
                           {"sanchai","sa","@gmail","sa","dfghggffd","05/20/2000",""},
                           {"sanchai","sa","sanchai@gmail","Raaghab24362t","sanchairlss@gmail.com","05/22/2000",""},
                           {"sanchai","san","sanchai@gmail.com","san@123","","05/20/2022",""}};
                                              	
        return data;
        
    }
}