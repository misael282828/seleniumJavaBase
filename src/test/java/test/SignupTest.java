package test;

import BaseTest.BaseTest;
import Page.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;



public class SignupTest extends BaseTest {

  @Test(description = "Test de hacer clic en Signup / Login")
  public void testSignupLoginClick() {
    LoginPage loginPage = new LoginPage(driver);
    loginPage.clickSignupLogin();

    validateUrl();
  }

  public void validateUrl() {
    // Obtener la URL actual
    String currentUrl = driver.getCurrentUrl();
    // URL esperada
    String expectedUrl = "https://automationexercise.com/login";
    // Validar que estamos en la página correcta
    Assert.assertEquals( currentUrl, expectedUrl, "this is what we want");
  }
}
