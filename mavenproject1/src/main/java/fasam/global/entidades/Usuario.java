/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fasam.global.entidades;

/**
 *
 * @author Aluno
 */
public class Usuario {
    private String Nome;
    private String Login;
    private String Senha;
    private String Email;
    private String Telefone;
    private String CPF;

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return Nome;
    }

    public String getLogin() {
        return Login;
    }

    public String getSenha() {
        return Senha;
    }

    public String getEmail() {
        return Email;
    }

    public String getTelefone() {
        return Telefone;
    }

    public String getCPF() {
        return CPF;
    }
}
