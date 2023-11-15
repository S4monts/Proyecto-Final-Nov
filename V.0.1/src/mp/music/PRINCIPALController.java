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
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.stage.WindowEvent;

/**
 * FXML Controller class
 *
 * @author Manuel Pacheco
 */
public class PRINCIPALController implements Initializable {
    
    @FXML
    private Button btnViento, btnPercusion, btnCuerda,btnClose,btnCarrito,btnHistorial;
    
    @FXML
    private void actionEvent(ActionEvent e){
        Object evt = e.getSource();
        if(evt.equals(btnViento)){
            MenuController.nom1 = "Saxofon";
            MenuController.nom2 = "Flauta";
            MenuController.nom3 = "Trompeta";
            MenuController.lima1 = "file:/C:/Users/Manuel Pacheco/Documents/NetBeansProjects/MP MUSIC/src/images/saxofon.jpg";
            MenuController.lima2 = "file:/C:/Users/Manuel Pacheco/Documents/NetBeansProjects/MP MUSIC/src/images/flauta.jpg";
            MenuController.lima3 = "file:/C:/Users/Manuel Pacheco/Documents/NetBeansProjects/MP MUSIC/src/images/trompeta.jpg";
            MenuController.pre1 = "450000";
            MenuController.pre2 = "120000";
            MenuController.pre3 = "320000";
            MenuController.desc1 = "Instrumento musical de viento,\n"
                    + " de metal, con boquilla de \n"
                    + "madera, caña y varias llaves\n"
                    + ", que es de invención moderna\n"
                    + " y muy usado, principalmente\n"
                    + " en las bandas militares y\n"
                    + " orquestas de jazz.";
            MenuController.desc2 = "Es un instrumento de viento\n"
                    + " madera con bisel, que es un \n"
                    + "agujero por el que sale el aire\n"
                    + "al soplar y que al vibrar en esta\n"
                    + " pieza produce el sonido. Puede\n"
                    + " tener hasta trece agujeros. Tapando\n"
                    + " unos u otros se producen las notas.\n"
                    + " Hay flautas dulces, traveseras, \n"
                    + "flautines, etc.";
            MenuController.desc3 = "Instrumento musical de viento,\n"
                    + " consistente en un tubo largo\n"
                    + " de metal que va ensanchándose desde\n"
                    + " la boquilla al pabellón y produce \n"
                    + "diversidad de sonidos según la fuerza \n"
                    + "con que la boca impele el aire.";
            LoadStage("Menu.fxml", e);
        }
        if(evt.equals(btnPercusion)){
            MenuController.nom1 = "Bateria";
            MenuController.nom2 = "Timbal";
            MenuController.nom3 = "Congas";
            MenuController.lima1 = "file:/C:/Users/Manuel Pacheco/Documents/NetBeansProjects/MP MUSIC/src/images/bateria.jpg";
            MenuController.lima2 = "file:/C:/Users/Manuel Pacheco/Documents/NetBeansProjects/MP MUSIC/src/images/timbal.jpg";
            MenuController.lima3 = "file:/C:/Users/Manuel Pacheco/Documents/NetBeansProjects/MP MUSIC/src/images/congas.jpg";
            MenuController.pre1 = "1200000";
            MenuController.pre2 = "340000";
            MenuController.pre3 = "230000";
            MenuController.desc1 = "Una batería es un conjunto de\n"
                    + "tambores , platillos y otros\n"
                    + "instrumentos de percusión, \n"
                    + "que se colocan en soportes\n"
                    + "​para ser tocados por un \n"
                    + "solo musico, con baquetas \n"
                    + "en ambas manos y los pies \n"
                    + "accionando los pedales que \n"
                    + "controlan el platillo del \n"
                    + "hi-haty el golpeador del bombo.";
            MenuController.desc2 = "Son tambores cilíndricos, de\n"
                    + "un solo parche, con armazón\n"
                    + "de metal, más cortos que los\n"
                    + "tom toms, y afinados más agudos\n"
                    + ", que se pueden acompañar con\n"
                    + "percusión auxiliar.";
            MenuController.desc3 = "El tambor de conga es un \n"
                    + "tambor alto, estrecho y de una sola \n"
                    + "cabeza de Cuba. Las congas son dentadas\n"
                    + "como barriles. Las congas se utilizan\n"
                    + "tradicionalmente en los géneros afrocubanos\n"
                    + "como la conga y la rumba, aunque ahora son\n"
                    + "muy comunes en otras formas de \n"
                    + "música latina.";
            
            LoadStage("Menu.fxml", e);
        }
        if(evt.equals(btnCuerda)){
            MenuController.nom1 = "Guitarra";
            MenuController.nom2 = "Ukelele";
            MenuController.nom3 = "Arpa";
            MenuController.lima1 = "file:/C:/Users/Manuel Pacheco/Documents/NetBeansProjects/MP MUSIC/src/images/guitarra.jpg";
            MenuController.lima2 = "file:/C:/Users/Manuel Pacheco/Documents/NetBeansProjects/MP MUSIC/src/images/ukelele.jpg";
            MenuController.lima3 = "file:/C:/Users/Manuel Pacheco/Documents/NetBeansProjects/MP MUSIC/src/images/arpa.jpg";
            MenuController.pre1 = "330000";
            MenuController.pre2 = "300000";
            MenuController.pre3 = "700000";
            MenuController.desc1 = "La guitarra es un instrumento\n"
                    + "musical de cuerda pulsada,\n"
                    + "compuesto de una caja de\n"
                    + "madera, un mástil sobre\n"
                    + "el que va adosado el\n"
                    + "diapasón o trastero —\n"
                    + "generalmente con un agujero \n"
                    + " acústico en el centro de la\n"
                    + "tapa (boca), y seis cuerdas. \n"
                    + "Sobre el diapasón van\n"
                    + "incrustados los trastes, \n"
                    + "que permiten las diferentes \n"
                    + "notas.";
            MenuController.desc2 = "Es un instrumento musical de cuerda pulsada, normalmente de 4 cuerdas que pueden ser dobles y que se asemeja en su forma a la guitarra aunque es de bastante menor tamaño. Su afinación y sonido son peculiares, por lo que destaca mucho entre otros instrumentos.";
            MenuController.desc3 = "El arpa​ es un instrumento de cuerda pulsada formado por un marco resonante y una serie variable de cuerdas tensadas entre la sección inferior y la superior."
                    + "";
            LoadStage("Menu.fxml", e);
        }
        if(evt.equals(btnClose)){
            
        }
        if(evt.equals(btnCarrito)){
            LoadStage("LISTADO.fxml", e);
        }
        if(evt.equals(btnHistorial)){
            LoadStage("HISTORIAL.fxml", e);
        }
    }
    
    /**
     * Initializes the controller class.
     */  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
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
            Logger.getLogger(PRINCIPALController.class.getName()).log(Level.SEVERE,null, ex);
        }
    }
}
