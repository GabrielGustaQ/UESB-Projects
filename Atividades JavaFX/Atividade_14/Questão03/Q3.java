package Questão03;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Q3 extends Application{
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage palco) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Q3.fxml"));
        Scene screen = new Scene(root);
        palco.setTitle("ArredondarNumero");
        palco.setScene(screen);
        palco.show();
    }
}
