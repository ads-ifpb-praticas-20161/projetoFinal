/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.praticas.TDD;

import br.edu.ifpb.praticas.entidade.Filme;
import br.edu.ifpb.praticas.validadores.ValidadoFilme;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jose2
 */
public class ValidadoFilmeTest {

    public ValidadoFilmeTest() {

    }

    @BeforeClass
    public static void setUpClass() {

    }

    @AfterClass
    public static void tearDownClass() {

    }

    @Before
    public void setUp() {

    }

    @After
    public void tearDown() {

    }

    /**
     * Test of filmeNull method, of class ValidadoFilme.
     */
    @Test
    public void testFilmeNull() throws Exception {
        ValidadoFilme instance = new ValidadoFilme();
        boolean result = instance.filmeNull(criaFilme());
        assertEquals(false, result);
    }

    /**
     * Test of NoneNull method, of class ValidadoFilme.
     */
    @Test
    public void testNoneNull() {
        ValidadoFilme instance = new ValidadoFilme();
        boolean result = instance.NoneNull(criaFilme());
        assertEquals(false, result);

    }

    /**
     * Test of anoInvalido method, of class ValidadoFilme.
     */
    @Test
    public void testAnoInvalido() {
        ValidadoFilme instance = new ValidadoFilme();
        boolean result = instance.anoInvalido(criaFilme());
        assertEquals(false, result);
    }
    private Filme criaFilme(){
        return   new Filme("007 contra moscol", "acao", 2012, 4);
    }

}
