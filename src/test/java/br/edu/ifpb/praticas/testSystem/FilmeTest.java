/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.praticas.testSystem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author jose2
 */
public class FilmeTest {
    
    @Test
    public void testCadastro() throws Exception {
        WebDriver driver = new FirefoxDriver();
        WebElement element = driver.findElement(By.name("nome"));
        // Create a new instance of the Firefox driver
        // Notice that the remainder of the code relies on the interface, 
        // not the implementation.
        

         assertEquals("http://localhost:8085/SisFilme/index.xhtml", driver.getCurrentUrl());

        Thread.sleep(2000L);
        element = driver.findElement(By.name("nome"));
        element.sendKeys("007 contra moscol");
         element = driver.findElement(By.name("nome"));
        element.sendKeys("007 contra moscol");
        
        element = driver.findElement(By.name("ano"));
        element.sendKeys("2014");
         element = driver.findElement(By.name("genero"));
         element = driver.findElement(By.name("nota"));
        element.sendKeys("2");
        
        element = driver.findElement(By.name("salvar"));
        Thread.sleep(2000L);
        element.click();
        assertEquals("http://localhost:8085/SisFilme/gerenciamento.xhtml", driver.getCurrentUrl());
        
        assertNotNull(element);
        // Wait for the page to load, timeout after 10 seconds
        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver d) {
                return d.getTitle().contains("NetBeans");
            }
        });

        //Close the browser
        driver.quit();
    }
    
}
