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
    
    public Artigo(Usuario usuario){
        this.usuario = usuario;
    }
        
    public int GetCodigo(){
        return this.codigo;
    }
    
    public void SetCodigo(int codigo){
        this.codigo = codigo;
    }
    
    public String GetTitulo(){
        return this.titulo;
    }
    
    public void SetTitulo(String titulo){
        this.titulo = titulo;
    }
 
    public String GetDescricao(){
        return this.descricao;
    }
    
    public void SetDescricao(String descricao){
        this.descricao = descricao;
    }

    public Comentario getComentario(int i) {
        return comentarios.get(i);
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
