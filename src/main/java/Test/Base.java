package Test;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chrome-win64\\chrome.exe");
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		driver = new ChromeDriver();
		//navigating website
		driver.get("http://library-admin.misfit-test.com/login");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys("nmajumder@misfit.tech");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("12345678Abc@@@");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='Log In']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[normalize-space()='Patron']")).click();
		Thread.sleep(5000);
        driver.findElement(By.xpath("//a[normalize-space()='Member']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//input[@id='search']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//input[@id='search']")).sendKeys("01911122334");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//span[normalize-space()='Filter by']")).click();
        Thread.sleep(4000);
        driver.findElement(By.id("phone")).click();
        driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("01911122334");
        driver.findElement(By.xpath("//div[@name='library_code']//span[@class='ant-select-selection-item']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//span[normalize-space()='Divisional Govt. Public Library, Mymensingh']")).click();
        //Thread.sleep(4000);
        //driver.findElement(By.xpath("//div[@name='gender']//span[@class='ant-select-selection-item']")).click();
       // Thread.sleep(4000);
        //driver.findElement(By.className("ant-select-selector")).click();   
//        Thread.sleep(5000);
//        driver.findElement(By.xpath("//span[@class='ant-select-selection-item']//span[@class='wave-money-text'][normalize-space()='Male']")).click();
//        Thread.sleep(2000);
//        WebElement element = driver.findElement(By.className("ant-select-selection-item"));
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//span[normalize-space()='Ok']")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//a[@class='sub-menu-item active']")).click();
//        Thread.sleep(3000);
//        //driver.findElement(By.xpath("//div[@name='gender']//span[@class='ant-select-selection-item']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[normalize-space()='Reset']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[normalize-space()='Rrgistered']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='search']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='search']")).sendKeys("01718000008");
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/aside[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[3]/span[1]/a[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='search']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='search']")).sendKeys("01642033333");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[normalize-space()='Filter by']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[normalize-space()='Reset']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//span[normalize-space()='Patron']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//span[normalize-space()='Staffs']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//a[normalize-space()='Admin Staff']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//input[@id='search']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Nazrul Islam Majumder");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//a[@class='btn btn-add ']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//input[@id='name']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Nazrul Islam");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//input[@id='rc_select_16']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//span[normalize-space()='Director (Deputy Secretary)']")).click();
}

}
