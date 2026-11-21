/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sgs.daos;

/**
 *
 * @author Arthur Câmara
 */
public class ReservaDAO {
    private int id;
    private String  cpfUsuario;
    private String codigoSala;
    private String data;
    
    public ReservaDAO(int id, String cpfUsuario, String codigoSala, String data) {
        this.id = id;
        this.cpfUsuario = cpfUsuario;
        this.codigoSala = codigoSala;
        this.data = data;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getCpfUsuario() {
        return cpfUsuario;
    }
    
    public void setCpfUsuario(String cpfUsuario) {
        this.cpfUsuario = cpfUsuario;
    }
    
    public String getCodigoSala() {
        return codigoSala;
    }
    
    public void setCodigoSala(String codigoSala) {
        this.codigoSala = codigoSala;
    }
    
    public String getData() {
        return data;
    }
    
    public void setData(String data) {
        this.data = data;
    }
}
