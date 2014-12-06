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
    
    /**
     * Cria a instância do artigo pelo comentário
     * @param comentario 
     */
    public Artigo(Comentario comentario){
        addComentarios(comentario);
    }
    
    /**
     * Cria a instância do artigo pelo usuário
     * @param value 
     */
    public Artigo(Usuario value){
        this.usuario = value;
    }
    
    /**
     * Retorna o código do artigo
     * @return 
     */
    public int getCodigo(){
        return this.codigo;
    }
    
    /**
     * Informa o código do artigo
     * @param value 
     */
    public void setCodigo(int value){
        this.codigo = value;
    }
    
    /**
     * Retorna o titulo do artigo
     * @return 
     */
    public String getTitulo(){
        return this.titulo;
    }
    
    /**
     * Informa o titulo do artigo
     * @param value 
     */
    public void setTitulo(String value){
        this.titulo = value;
    }
 
    /**
     * Retorna a descrição do artigo
     * @return 
     */
    public String getDescricao(){
        return this.descricao;
    }
    
    /**
     * Informa a descrição do artigo
     * @param value 
     */
    public void setDescricao(String value){
        this.descricao = value;
    }

    /**
     * Retorna o comentário do artigo
     * @param index
     * @return 
     */
    public Comentario getComentario(int index) {
        return comentarios.get(index);
    }

    /**
     * Retorna o usuário do artigo
     * @return 
     */
    public Usuario getUsuario() {
        return this.usuario;
    }
        
    /**
     * Adicionar um novo comentário para o artigo
     * @param comentario 
     */
    public void addComentarios(Comentario comentario) {
        if(this.comentarios == null) {
            this.comentarios = new ArrayList<Comentario>();
        }
        this.comentarios.add(comentario);
    }
    
    /**
     * Remove um comentário do artigo 
     * @param comentario 
     */
    public void remComentarios(Comentario comentario) {
        if(this.comentarios != null) {
            this.comentarios.remove(comentario);
        }
    }
}
