/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fasam.global.entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public final class Artigo {
    
    int _codigo;
    String _titulo;
    String _descricao;
    List<Comentario> comentarios;
    Usuario _Usuario;
    
    public Artigo(Comentario cComentario){
        addComentarios(cComentario);
    }
    
    public Artigo(Usuario oUsuario){
        _Usuario = oUsuario;
    }
        
    public int GetCodigo(){
        return _codigo;
    }
    
    public void SetCodigo(int icodigo){
        _codigo = icodigo;
    }
    
    public String GetTitulo(){
        return _titulo;
    }
    
    public void SetTitulo(String stitulo){
        _titulo = stitulo;
    }
 
    public String GetDescricao(){
        return _descricao;
    }
    
    public void SetDescricao(String sdescricao){
        _descricao = sdescricao;
    }

    public Comentario getComentario(int i) {
        return comentarios.get(i);
    }

    public Usuario getUsuario() {
        return _Usuario;
    }
        
    public void addComentarios(Comentario _comentario) {
        if(this.comentarios == null)
            this.comentarios = new ArrayList<Comentario>();
        this.comentarios.add(_comentario);
    }
    
    public void remComentarios(Comentario _comentario) {
        if(this.comentarios != null)
            this.comentarios.remove(_comentario);
    }
}
