import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SortPage extends PageBase {


    private  By sort = By.xpath("//select[@name='sort']");
    WebElement SortElement;

    private  By sortrelevant = By.xpath("//option[@value='relevance']");
    WebElement SortrelevantElement;

    private  By sortreviews = By.xpath("//option[@value='most-reviewed']");
    WebElement SortreviewsElement;

    private  By sortrates = By.xpath("//option[@value='highest-rated']");
    WebElement SortratesElement;

    private  By sortnewest = By.xpath("//option[@value='newest']");
    WebElement SortnewestElement;

    public SortPage(WebDriver driver) {
        super(driver);
    }

    public void clickonsortrelevant (){
        SortElement = driver.findElement(sort);
        SortrelevantElement = driver.findElement(sortrelevant);
        HomePage.clicking(SortElement);
        HomePage.clicking(SortrelevantElement);
    }
    public void clickonsortreviews (){
        SortElement = driver.findElement(sort);
        SortreviewsElement = driver.findElement(sortreviews);
        HomePage.clicking(SortElement);
        HomePage.clicking(SortreviewsElement);
    }
    public void clickonsortrates (){
        SortElement = driver.findElement(sort);
        SortratesElement = driver.findElement(sortrates);
        HomePage.clicking(SortElement);
        HomePage.clicking(SortratesElement);
    }
    public void clickonsortnewest (){

        SortElement = driver.findElement(sort);
        SortnewestElement = driver.findElement(sortnewest);
        HomePage.clicking(SortElement);
        HomePage.clicking(SortnewestElement);
    }

}
