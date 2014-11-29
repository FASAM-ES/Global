/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fasam.mavenproject1;

import fasam.global.entidades.Usuario;
import junit.framework.TestCase;

/**
 *
 * @author Aluno
 */
public class DeveConterUsuarios extends TestCase {
    
    public DeveConterUsuarios(String testName) {
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

    public void testUsuario() {
        Usuario Teste = new Usuario("Demetrius A. Barbosa");
        assertNotNull(Teste.getNome());
    }
}
