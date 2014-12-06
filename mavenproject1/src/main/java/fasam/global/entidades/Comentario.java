/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fasam.global.entidades;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe comentario
 * @author Aluno
 */
public class Comentario {
    private String titulo;
    private String descricao;
    private List<Usuario> usuarios;
    
    /*
     * Propriedade para acessar usuários
     */
    public Usuario getUsuarios(Integer value) {
        return this.usuarios.get(value);
    }

     /*
     * Metodo para adicionar usuário as lista
     */
    public void addUsuario(Usuario usuario) {
        if (this.usuarios == null) {
            this.usuarios = new ArrayList<Usuario>();
        }
        this.usuarios.add(usuario);
    }
    
     /*
     * Metodo para remover usuário da lista
     */
    public void remUsuario(Usuario usuario) {
        if (this.usuarios == null) {
            this.usuarios = new ArrayList<Usuario>();
        }
        this.usuarios.remove(usuario);
    }
    
     /*
     * Propriedade para acessar o titulo
     */
    public String getTitulo() {
        return this.titulo;
    }

    /*
    * Propriedade para setar o titulo
    */
    public void setTitulo(String value) {
        this.titulo = value;
    }

    /*
    * Propriedade para acessar o descricao
    */
    public String getDescricao() {
        return this.descricao;
    }

    /*
    * Propriedade para acessar o descricao
    */
    public void setDescricao(String value) {
        this.descricao = value;
    }
}
