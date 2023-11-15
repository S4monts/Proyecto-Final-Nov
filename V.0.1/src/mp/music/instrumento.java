/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mp.music;

/**
 *
 * @author Manuel Pacheco
 */
public class instrumento {
    String nom, desc, precio, comprador;
    instrumento sig, ant;

    public instrumento() {
    }

    public instrumento(String nom, String desc, String precio, String comprador) {
        this.nom = nom;
        this.desc = desc;
        this.precio = precio;
        this.comprador = comprador;
    }

    public String getComprador() {
        return comprador;
    }

    public void setComprador(String comprador) {
        this.comprador = comprador;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
    
}
