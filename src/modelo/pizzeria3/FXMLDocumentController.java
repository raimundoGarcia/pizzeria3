
package modelo.pizzeria3;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;


public class FXMLDocumentController implements Initializable {

    @FXML
    private Button button;
    @FXML
    private Label label;
    
    private pizza pedido;
    @FXML
    private ToggleButton togBut;
    
  
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      pizza margarita = new pizza("normal","margarita","familiar");
      togBut.setUserData("normal");
      
      if (togBut.getUserData().equals(pedido.getMasa())){
          System.out.println("Hola");
      }
    }    

    @FXML
    private void handleButtonAction(ActionEvent event) {
        
    }

    @FXML
    private void hola(ActionEvent event) {
    }
    
}
