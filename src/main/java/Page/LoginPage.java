package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
  private WebDriver driver;
  private final By signupLoginButton = By.xpath("//a[@href='/login']");

  public LoginPage(WebDriver driver) {
    this.driver = driver;
  }

  public void clickSignupLogin() {
    driver.findElement(signupLoginButton).click();

  }

}
