/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mp.music;

import java.util.Stack;
import javax.swing.JOptionPane;

/**
 *
 * @author Manuel Pacheco
 */
public class carrito {
    public static Stack<instrumento> pila;
    
    public carrito(){
        this.pila = new Stack<>();
    }
    
    public instrumento buscarnombre (String nom){
        for(instrumento buscar : pila){
            if(buscar.nom.equals(nom)){
                return buscar;
            }
        }
        return null;
    }
    
    public void push (String nom, String desc, String precio, String comprador){
        instrumento agregar = new instrumento(nom, desc, precio, comprador);
        for(instrumento nuevo : pila){
            if(!nuevo.nom.equals(nom)){
                pila.push(agregar);
            }else{
                JOptionPane.showMessageDialog(null, "Este producto ya se encuentra en el carrito!");
            }
        }
    }
    public void comprar (String nom){
        for(instrumento eliminar : pila){
            if(eliminar.nom.equals(nom)){
                pila.remove(eliminar);
            }
        }
        JOptionPane.showMessageDialog(null, "Producto comprado con exito!");
    }
}
