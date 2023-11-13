/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mp.music;

import javax.swing.JOptionPane;

/**
 *
 * @author Manuel Pacheco
 */
public class REGISTRO {
   USUARIOS cap;
   
   public USUARIOS existenombre(String user){
       USUARIOS p = cap;
       if(cap == null){
           return null;
       }else{
           while(p != null){
               if(p.user.equals(user)){
                   return p;
               }else{
                   p=p.SIG;
                }
            }
           return null;
       }
   }
   
   public USUARIOS crearnodo (String user, String pass){
       USUARIOS info, p;
       String nom;
       if(user.equals("") || pass.equals("")){
           JOptionPane.showMessageDialog(null, "Ambos campos son obligatorios!");
           return null;
       } else {
           do {
               nom = user;
               p=existenombre(nom);
               if(p != null){
                   JOptionPane.showMessageDialog(null, "Este nombre de usuario ya se encuentra registrado!");
                   return null;
               }      
           }while (p != null);
           if(p == null){
               info = new USUARIOS(user, pass);
               return info;
           }else{
               return null;
           }
       }
   }
   public void llenarlista (String user, String pass){
       USUARIOS p = crearnodo(user, pass);
       if(p != null){
        if(cap == null){
           cap = p;
        }else{
           cap.SIG = cap;
           cap = p;       
        }
            JOptionPane.showMessageDialog(null, "Usuario registrado exitosamente\n" 
                + "inicie sesion para continuar");
       }
   }
   public USUARIOS login (String user, String pass){
       USUARIOS p = cap;
       while(p != null){
           if(p.user.equals(user) && p.pass.equals(pass)){
               return p;
           }else{
               p = p.SIG;
           }         
       }
       return null;
   }
}
