/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fasam.mavenproject1;

import fasam.global.entidades.Categoria;
import junit.framework.TestCase;

/**
 *
 * @author Aluno
 */
public class ValidarCategoria extends TestCase {
    
    public ValidarCategoria(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
    // TODO add test methods here. The name must begin with 'test'. For example:
    public void testValidarCategoria() {
        Categoria c = new Categoria("Teste");
        assertNotNull(c.getNome());
    }
}
