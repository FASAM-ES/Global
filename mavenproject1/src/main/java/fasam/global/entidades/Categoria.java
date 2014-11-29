/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fasam.global.entidades;


import java.util.ArrayList;
import java.util.List;

/**
 *aasas asa sa
 * @author Aluno
 */
public class Categoria {
    
    private String nome;
    private String descricao;
    private List<Artigo> artigos;

    public Categoria(String nome) {
        this.nome = nome;
    }
    
    public Artigo getArtigo(Integer i){
        return artigos.get(i);
    }
    
    public void addArtigo(Artigo artigo){
        if(this.artigos == null){
            this.artigos = new ArrayList<Artigo>();
        }
        this.artigos.add(artigo);
    }
    
    public void remArtigo(Artigo artigo){
        if(this.artigos != null){
            this.artigos.remove(artigo);
        }
    }
    
    public String getNome() {
        return nome;
    }
   
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getDescricao() {
        return descricao;
    }
   
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
