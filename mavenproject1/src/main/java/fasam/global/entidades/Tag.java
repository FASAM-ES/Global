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
    
    public void AddTag(Tag Tag) {
        if (this.Tag == null) {
            this.Tag=new ArrayList<Tag>();
        }
        this.Tag.add(Tag);
    }
    
    public void RemUsuario(Usuario Usuario) {
        if (this.Tag == null) {
            this.Tag=new ArrayList<Tag>();
        }
        this.Tag.remove(Tag);
    }
    
}
