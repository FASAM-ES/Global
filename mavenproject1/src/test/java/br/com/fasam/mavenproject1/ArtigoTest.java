/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fasam.mavenproject1;

import fasam.global.entidades.Artigo;
import fasam.global.entidades.Comentario;
import fasam.global.entidades.Usuario;
import junit.framework.TestCase;

/**
 *
 * @author Aluno
 */
public class ArtigoTest extends TestCase {
    
    public ArtigoTest(String testName) {
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
    // public void testHello() {}
    
    public void testComentarioEmArtigo(){
        Artigo artTest = new Artigo(new Comentario());
        
        assertNotNull(artTest.getComentario(0));
    }
    
    public void testUsuarioEmArtigo(){
        Artigo artTest = new Artigo(new Usuario("Teste"));
        
        assertNotNull(artTest.getUsuario());
    }
    
    public void testSomar(){
        int val = 5;
        assertEquals(val, 1 + 4);
    }
}
