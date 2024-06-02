package BaseTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

  public static WebDriver driver;

  @BeforeMethod
  public void setUp()   {
    driverConfigurations();
    // Abrir la URL especificada
    driver.get("https://automationexercise.com/");

  }

  public void driverConfigurations()   {
    // Configurar el Microsoft Edge Driver antes de inicializar el WebDriver
    WebDriverManager.edgedriver().setup();
    // Configurar opciones de Edge (disable-popup-blocking)
    EdgeOptions edgeOptions = new EdgeOptions();
    edgeOptions.addArguments("--disable-popup-blocking");
    edgeOptions.addArguments("--inprivate");
    // edgeOptions.addArguments("--headless");

    // Inicializar el WebDriver con las opciones configurada
    driver = new EdgeDriver(edgeOptions);

    // Maximizar la ventana del navegador
    //Establecer el tamaño de la ventana después de la inicialización
    // driver.manage().window().setSize(new org.openqa.selenium.Dimension(2300, 800));
    driver.manage().window().maximize();
    // driver.manage().window().setSize(new org.openqa.selenium.Dimension(2400, 1300));
    // driver.manage().window().setSize(new org.openqa.selenium.Dimension(1200, 800));
  }

  @AfterMethod
  public void tearDown() {
    if (driver != null) {
      driver.quit();
    }
  }



}
