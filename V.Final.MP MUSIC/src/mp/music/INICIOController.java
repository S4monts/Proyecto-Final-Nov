/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package mp.music;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Stack;
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
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.stage.WindowEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Manuel Pacheco
 */
public class INICIOController implements Initializable {
    
    REGISTRO list = new REGISTRO();
    
    public static String UsuarioActual;
    private REGISTRO listaUser = new REGISTRO();
    
    @FXML
    private Button btnLogin, btnSignup;
    
    @FXML
    private TextField txtIUser, txtRUser, txtIPass, txtRPass;
    
    @FXML
    private void actionEvent(ActionEvent e){
        Object evt = e.getSource();
        if(evt.equals(btnSignup)){
            String user = txtRUser.getText();
            String pass = txtRPass.getText();
            listaUser.llenarlista(user, pass);
            txtRUser.setText("");
            txtRPass.setText("");
        }
        if(evt.equals(btnLogin)){
            String user = txtIUser.getText();
            String pass = txtIPass.getText();
            USUARIOS usuario = listaUser.login(user, pass);
            if(usuario != null){
                LoadStage("PRINCIPAL.fxml", e);
                UsuarioActual = user;
                
            }else{
                JOptionPane.showMessageDialog(null, "Datos de acceso incorrectos, ingrese nuevamente");
                txtIPass.setText("");
                txtIUser.setText("");
            }
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Stack<instrumento> p;
        p = carrito.pila;
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
            Logger.getLogger(INICIOController.class.getName()).log(Level.SEVERE,null, ex);
        }
    }
}
