package visao;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage palco) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("tela1Menu.fxml"));
        Scene screen = new Scene(root);
        palco.setTitle("Cadastro de Usuarios");
        palco.setScene(screen);
        palco.show();
    }
}
