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
public class Artigo {
    
    int _codigo;
    String _titulo;
    String _descricao;
    List<Comentario> comentarios;
            
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

    public void addComentarios(Comentario _comentario) {
        if(this.comentarios == null)
            this.comentarios = new ArrayList<Comentario>();
        this.comentarios.add(_comentario);
    }
    
    public void remComentarios(Comentario _comentario) {
        if(this.comentarios != null)
            this.comentarios.remove(_comentario);
    }
    
    public int inserir(){
        return 0;
    }
    
    public int excluir(){
        return 0;
    }
    
    public int atualizar(){
        return 0;
    }
}
