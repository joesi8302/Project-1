import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\tools\\selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://localhost:9000");

        //ADD
        WebElement addElem1 = driver.findElement(By.id("add-input"));
        addElem1.sendKeys("1");

        WebElement addElem2 = driver.findElement(By.id("add-input2"));
        addElem2.sendKeys("1");

        WebElement addBtnElem = driver.findElement(By.id("add-btn"));
        addBtnElem.click();

        //driver.switchTo().frame("add-result");  //This was to print out to the console


        //SUBTRACT

        //driver.switchTo().defaultContent();

        WebElement subtractElem1 = driver.findElement(By.id("subtract-input"));
        subtractElem1.sendKeys("5");

        WebElement subtractElem2 = driver.findElement(By.id("subtract-input2"));
        subtractElem2.sendKeys("2");

        WebElement subtractBtnElem = driver.findElement(By.id("subtract-btn"));
        subtractBtnElem.click();

        driver.switchTo().frame("subtract-result");


        //MULTIPLY
        driver.switchTo().defaultContent();

        WebElement multiplyElem1 = driver.findElement(By.id("multiply-input"));
        multiplyElem1.sendKeys("6");

        WebElement multiplyElem2 = driver.findElement(By.id("multiply-input2"));
        multiplyElem2.sendKeys("3");

        WebElement multiplyBtnElem = driver.findElement(By.id("multiply-btn"));
        multiplyBtnElem.click();

        driver.switchTo().frame("multiply-result");


        //DIVIDE
        driver.switchTo().defaultContent();

        WebElement divideElem1 = driver.findElement(By.id("divide-input"));
        divideElem1.sendKeys("40");

        WebElement divideElem2 = driver.findElement(By.id("divide-input2"));
        divideElem2.sendKeys("4");

        WebElement divideBtnElem = driver.findElement(By.id("divide-btn"));
        divideBtnElem.click();

        driver.switchTo().frame("divide-result");


    }
}
