package testes.funcionais;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IndexTest {
	
	@Test
    public void deveTestarIndexHTML() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/renan/Downloads/index.html");
        
        WebDriver driver = new ChromeDriver();

        driver.get("file:///C:/Users/renan/Downloads/index.html");

        WebElement nomeProdutoInput = driver.findElement(By.id("nomeProduto"));
        WebElement precoProdutoInput = driver.findElement(By.id("precoProduto"));
        WebElement adicionarBotao = driver.findElement(By.id("adicionarBotao"));

        nomeProdutoInput.sendKeys("Renan");
        precoProdutoInput.sendKeys("19");

        adicionarBotao.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}