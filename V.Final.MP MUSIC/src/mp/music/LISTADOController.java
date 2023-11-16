/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mp.music;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.stage.WindowEvent;
/**
 * FXML Controller class
 *
 * @author Manuel Pacheco
 */
public class LISTADOController implements Initializable {
    
    REGISTRO list = new REGISTRO();
    
    historial lista = new historial();
    carrito pila = new carrito();

    @FXML
    private TableView<instrumento> tabla;
    
    @FXML
    private TableColumn<instrumento, String> nom;
    
    @FXML
    private TableColumn<instrumento, String> desc;
    
    @FXML
    private TableColumn<instrumento, String> precio;
    
    public static ObservableList<instrumento> instrumentos = FXCollections.observableArrayList();
    
    @FXML
    private Button btnRegresar,btnComprar;
    
    @FXML
    private void actionEvent(ActionEvent e){
        Object evt = e.getSource();
        if(evt.equals(btnRegresar)){
            LoadStage("PRINCIPAL.fxml", e);
        }
        if(evt.equals(btnComprar)){
            String nombre = tabla.getSelectionModel().getSelectedItem().nom;
            String descrip = tabla.getSelectionModel().getSelectedItem().desc;
            String prec = tabla.getSelectionModel().getSelectedItem().precio;
            lista.crearNodo(nombre, descrip, prec);
            HISTORIALController.historia.add(historial.lista);
            pila.comprar(nombre);
            instrumentos.remove(tabla.getSelectionModel().getSelectedItem());
        }
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Stack<instrumento> p;
        p = carrito.pila;
        nom.setCellValueFactory(new PropertyValueFactory<instrumento, String>("nom"));
        desc.setCellValueFactory(new PropertyValueFactory<instrumento, String>("desc"));
        precio.setCellValueFactory(new PropertyValueFactory<instrumento, String>("precio"));
        tabla.setItems(instrumentos);
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
