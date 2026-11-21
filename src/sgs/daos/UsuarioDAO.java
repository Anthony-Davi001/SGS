/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sgs.daos;


/**
 *
 * @author Arthur Câmara
 */
public class UsuarioDAO {
    private String cpf;
    private int nivelPermissao;
    private String nome;
    private String email;
    private String senha;
    
    public UsuarioDAO(String cpf, int nivelPermissao, String nome, String email, String senha) {
        this.cpf = cpf;
        this.nivelPermissao = nivelPermissao;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }
    
    public String getCpf() {
        return cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public int getNivelPermissao() {
        return nivelPermissao;
    }
    
    public void setNivelPermissao(int nivelPermissao) {
        this.nivelPermissao = nivelPermissao;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getSenha() {
        return senha;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }
}

