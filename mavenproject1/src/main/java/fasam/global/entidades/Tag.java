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
    String _nome;
    String _descricao;
    List<Artigo> artigos;
public Tag(Artigo artigo){
    this.AddArtigos(artigo);
}
        
    public Artigo getArtigos(Integer index) {
        if (artigos == null) {
            this.artigos= new ArrayList<Artigo>();
        }
        return artigos.get(index);
    }
    
    public void AddArtigos(Artigo artigo) {
        if (artigos == null) {
            this.artigos= new ArrayList<Artigo>();
        }
        this.artigos.add(artigo);
    }
    
    public void RemArtigos(Artigo artigo) {
        if (artigos != null) {
            this.artigos.remove(artigo);
        }
    }
    
    public String getNome() {
        return _nome;
    }

    public String getDescricao() {
        return _descricao;
    }

    public void setNome(String _nome) {
        this._nome = _nome;
    }

    public void setDescricao(String _descricao) {
        this._descricao = _descricao;
    }
  
}
