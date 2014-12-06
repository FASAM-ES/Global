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

    /***
     * Recebe o nome da categoria.
     * @param nome 
     */
    public Categoria(String nome) {
        this.nome = nome;
    }
    
    /***
     * Recupera o artigo.
     * @param i
     * @return retorna o artigo.
     */
    public Artigo getArtigo(Integer i){
        return artigos.get(i);
    }
    
    /***
     * Adiciona um novo artigo.
     * @param artigo 
     */
    public void addArtigo(Artigo artigo){
        if(this.artigos == null){
            this.artigos = new ArrayList<Artigo>();
        }
        this.artigos.add(artigo);
    }
    
    /***
     * Remove o artigo
     * @param artigo 
     */
    public void remArtigo(Artigo artigo){
        if(this.artigos != null){
            this.artigos.remove(artigo);
        }
    }
    
    /***
     * Recupera o nome da categoria.
     * @return 
     */
    public String getNome() {
        return nome;
    }
   
    /***
     * Seta o nome da categoria.
     * @param nome 
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    /***
     * Recupera a descrição.
     * @return.
     */
    public String getDescricao() {
        return descricao;
    }
   
   /***
    * Seta a descrição.
    * @param descricao 
    */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
