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
    
    int codigo;
    String titulo;
    String descricao;
    List<Comentario> comentarios;
    Usuario usuario;
    
    public Artigo(Comentario cComentario){
        addComentarios(cComentario);
    }
    
    public Artigo(Usuario usuario){
        usuario = usuario;
    }
        
    public int GetCodigo(){
        return codigo;
    }
    
    public void SetCodigo(int codigo){
        codigo = codigo;
    }
    
    public String GetTitulo(){
        return titulo;
    }
    
    public void SetTitulo(String titulo){
        titulo = titulo;
    }
 
    public String GetDescricao(){
        return descricao;
    }
    
    public void SetDescricao(String descricao){
        descricao = descricao;
    }

    public Comentario getComentario(int i) {
        return comentarios.get(i);
    }

    public Usuario getUsuario() {
        return usuario;
    }
        
    public void addComentarios(Comentario comentario) {
        if(this.comentarios == null)
            this.comentarios = new ArrayList<Comentario>();
        this.comentarios.add(comentario);
    }
    
    public void remComentarios(Comentario comentario) {
        if(this.comentarios != null)
            this.comentarios.remove(comentario);
    }
}
