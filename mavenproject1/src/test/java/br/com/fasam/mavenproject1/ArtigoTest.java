/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fasam.mavenproject1;

import fasam.global.entidades.Artigo;
import fasam.global.entidades.Comentario;
import junit.framework.Test;
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
    
    public void testUsuarioEmArtigo(){
        Artigo artTest = new Artigo(new Comentario());
        
        assertNotNull(artTest.getComentario(0));
    }
}
