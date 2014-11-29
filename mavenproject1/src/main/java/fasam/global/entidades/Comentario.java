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
public class Comentario {
    private String Titulo;
    private String Descricao;
    private List<Usuario> Usuarios;

    public Usuario getUsuarios(Integer i) {
        return Usuarios.get(i);
    }
    
    public void AddUsuario(Usuario Usuario) {
        if (this.Usuarios == null) {
            this.Usuarios=new ArrayList<Usuario>();
        }
        this.Usuarios.add(Usuario);
    }
    
    public void RemUsuario(Usuario Usuario) {
        if (this.Usuarios == null) {
            this.Usuarios=new ArrayList<Usuario>();
        }
        this.Usuarios.remove(Usuario);
    }
    
    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }
}
