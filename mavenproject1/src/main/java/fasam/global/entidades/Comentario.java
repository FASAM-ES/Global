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
    private String titulo;
    private String descricao;
    private List<Usuario> usuarios;

    public Usuario getUsuarios(Integer value) {
        return this.usuarios.get(value);
    }
    
    public void addUsuario(Usuario usuario) {
        if (this.usuarios == null) {
            this.usuarios = new ArrayList<Usuario>();
        }
        this.usuarios.add(usuario);
    }
    
    public void remUsuario(Usuario usuario) {
        if (this.usuarios == null) {
            this.usuarios = new ArrayList<Usuario>();
        }
        this.usuarios.remove(usuario);
    }
    
    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String value) {
        this.titulo = value;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String value) {
        this.descricao = value;
    }
}
