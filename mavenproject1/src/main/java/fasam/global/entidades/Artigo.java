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
    
    public Artigo(Comentario comentario){
        addComentarios(comentario);
    }
    
    public Artigo(Usuario value){
        this.usuario = value;
    }
        
    public int GetCodigo(){
        return this.codigo;
    }
    
    public void SetCodigo(int value){
        this.codigo = value;
    }
    
    public String GetTitulo(){
        return this.titulo;
    }
    
    public void SetTitulo(String value){
        this.titulo = value;
    }
 
    public String GetDescricao(){
        return this.descricao;
    }
    
    public void SetDescricao(String value){
        this.descricao = value;
    }

    public Comentario getComentario(int index) {
        return comentarios.get(index);
    }

    public Usuario getUsuario() {
        return this.usuario;
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
