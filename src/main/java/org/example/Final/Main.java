package org.example.Final;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Main extends AbstractPage {
    //ВХОД
    @FindBy (xpath = "/html/body/div/main/div/div/div/form/div[1]/label/input")
    private WebElement user;
@FindBy (xpath = "/html/body/div/main/div/div/div/form/div[2]/label/input")
    private WebElement password;
@FindBy (xpath = "/html/body/div/main/div/div/div[1]/form/div[3]/button/span")
private WebElement Vhod;

//Посты
@FindBy (xpath = "/html/body/div[1]/main/div/div[3]/div[1]/a[1]/img")
private WebElement Kote;
@FindBy (xpath = "/html/body/div[1]/main/div/div[3]/div[2]/div/a[2]")
private WebElement Next;
@FindBy (xpath = "/html/body/div[1]/main/div/div[3]/div[2]/div/a[1]")
private WebElement down;










//ВХод
public Main userpole(String value) {
    user.click();
    user.sendKeys(value);
    return this;
}
public Main passwordpole(String value){
    password.click();
    password.sendKeys(value);
    return this;
}
public Main vhodclick (){
    Vhod.click();
    return this;
}
//Посты
public Main kotclick(){
    Kote.click();
    return this;
}
public Main NextPage(){
    Next.click();
    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        e.printStackTrace();}
    return this;
}
public Main DownPage(){
    down.click();
    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        e.printStackTrace();}
    return this;
}





    public Main(WebDriver driver) {
        super(driver);
    }

}
