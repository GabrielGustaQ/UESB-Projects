package controle;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;

public class tela1controle {

    @FXML
    private AnchorPane anchorPane;

    @FXML
    private MenuBar menuBar;

    @FXML
    private Menu menuItemCadastro;

    @FXML
    private MenuItem menuItemCadastroClientes;

    @FXML
    private Menu menuItemRelatorios;

    @FXML
    private MenuItem menuItemRelatoriosVendas;
            
    public void initialize(URL url, ResourceBundle rb){
        
        
    }
    @FXML
    public void showFXMLAnchorPaneCadastroClientes() throws IOException{
        AnchorPane a = (AnchorPane) FXMLLoader.load(getClass().getResource("tela1Menu.fxml"));
        anchorPane.getChildren().setAll(a);

    }
     @FXML
    public void showFXMLAnchorPaneRelatorio() throws IOException{
        AnchorPane a = (AnchorPane) FXMLLoader.load(getClass().getResource("tela3Menu.fxml"));
        anchorPane.getChildren().setAll(a);

    }

    
}
