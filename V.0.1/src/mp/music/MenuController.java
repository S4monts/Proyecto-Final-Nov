/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mp.music;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.stage.WindowEvent;

/**
 * FXML Controller class
 *
 * @author Manuel Pacheco 
 */
public class MenuController implements Initializable {
    
    public static carrito pila = new carrito();
    
    
    public static String nom1, nom2, nom3,lima1,lima2,lima3,pre1,pre2,pre3,desc1,desc2,desc3;
    
    @FXML
    private Label lbI1, lbI2, lbI3,lbprecio1,lbprecio2,lbprecio3;
    
    @FXML
    private ImageView ima1,ima2,ima3;
    
    @FXML
    private Button btnRegresar,btninfo1,btninfo2,btninfo3;
    
    @FXML
    private void actionEvent (ActionEvent e){
        Object evt = e.getSource();
        if(evt.equals(btnRegresar)){
            LoadStage("PRINCIPAL.fxml", e);
        }
        if(evt.equals(btninfo1)){
            instrumento instru1 = new instrumento(nom1, desc1, pre1, INICIOController.UsuarioActual);
            pila.push(instru1.nom,instru1.desc,instru1.precio,instru1.comprador);
            LISTADOController.instrumentos.add(instru1);
        }
        if(evt.equals(btninfo2)){
            instrumento instru2 = new instrumento(nom2, desc2, pre2, INICIOController.UsuarioActual);
            pila.push(instru2.nom,instru2.desc,instru2.precio,instru2.comprador);
            LISTADOController.instrumentos.add(instru2);
        }
        if(evt.equals(btninfo3)){
            instrumento instru3 = new instrumento(nom3, desc3, pre3, INICIOController.UsuarioActual);
            pila.push(instru3.nom,instru3.desc,instru3.precio,instru3.comprador);
            LISTADOController.instrumentos.add(instru3);
        }
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        lbI1.setText(nom1);
        lbI2.setText(nom2);
        lbI3.setText(nom3);
        lbprecio1.setText(pre1);
        lbprecio2.setText(pre2);
        lbprecio3.setText(pre3);
        Image show1 = new Image(lima1);
        ima1.setImage(show1);
        Image show2= new Image(lima2);
        ima2.setImage(show2);
        Image show3 = new Image(lima3);
        ima3.setImage(show3);
        // TODO
    }    
    private void LoadStage(String url, Event event){
        try {
            Object eventSource = event.getSource();
            Node sourceAsNode = (Node) eventSource;
            Scene oldScene = sourceAsNode.getScene();
            Window window = oldScene.getWindow();
            Stage stage = (Stage) window;
            stage.hide();
            
            Parent root = FXMLLoader.load(getClass().getResource(url));
            Scene scene = new Scene(root);
            Stage newStage = new Stage();
            newStage.setScene(scene);
            newStage.show();
            
            newStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
                @Override
                public void handle(WindowEvent event) {
                    Platform.exit();
                }        
            });
        }catch ( IOException ex){
            Logger.getLogger(MenuController.class.getName()).log(Level.SEVERE,null, ex);
        }
    }
}
