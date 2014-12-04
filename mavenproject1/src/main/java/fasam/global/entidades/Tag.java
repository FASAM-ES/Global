/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor. teste commit
 */
package fasam.global.entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class Tag {
    String nome;
    String descricao;
    List<Artigo> artigos;
    
    public Tag(Artigo artigo){
        this.AddArtigos(artigo);
    }
        
    public Artigo getArtigos(Integer index) {
        if (this.artigos == null) {
            this.artigos = new ArrayList<Artigo>();
        }
        return this.artigos.get(index);
    }
    
    public void AddArtigos(Artigo artigo) {
        if (this.artigos == null) {
            this.artigos = new ArrayList<Artigo>();
        }
        this.artigos.add(artigo);
    }
    
    public void RemArtigos(Artigo artigo) {
        if (this.artigos != null) {
            this.artigos.remove(artigo);
        }
    }
    
    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setNome(String value) {
        this.nome = value;
    }

    public void setDescricao(String value) {
        this.descricao = value;
    }
  
}
