/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.praticas.testSystem;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author jose2
 */
public class TituloPaginaT {
    
    @Test
    public void testTitulo() throws Exception {
       
        WebDriver driver = new FirefoxDriver();
 driver.get("http://localhost:8085/SisFilme/index.xhtml");
          assertEquals("Avalie filmes", driver.getTitle());
    
       
        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver d) {
                return d.getTitle().contains("Avalie filmes");
            }
        });

        //Close the browser
        driver.quit();
    }
    
}
