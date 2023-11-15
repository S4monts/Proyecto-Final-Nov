/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mp.music;

/**
 *
 * @author Manuel Pacheco
 */
public class historial {
    public static instrumento lista;
    public historial(){ lista = null; }
    public void crearNodo(String nom, String desc, String precio){
        instrumento p = new instrumento(nom, desc, precio, INICIOController.UsuarioActual);
        if(lista == null){
            lista = p;
            lista.sig=lista.ant=lista;
        }else{
            p.ant = lista.ant;
            p.sig = lista;
            lista.ant.sig=p;
            lista.ant=p;
        }
    }
}
