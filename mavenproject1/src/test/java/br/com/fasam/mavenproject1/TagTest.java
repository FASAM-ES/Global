/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fasam.mavenproject1;

import fasam.global.entidades.Artigo;
import fasam.global.entidades.Tag;
import fasam.global.entidades.Usuario;
import junit.framework.Assert;
import static junit.framework.Assert.assertEquals;
import junit.framework.TestCase;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
/**
 *
 * @author Aluno
 */
public class TagTest extends TestCase {
    
    public TagTest(String testName) {
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
    
     public void testArtigo() 
     {
     
        Tag Art;
        Art = new Tag(new Artigo(new Usuario("maria")));
      assertNotNull(Art.getArtigos(0));
                           
              }
     
}
