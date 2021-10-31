package Questão02;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import java.lang.Math;
import java.text.NumberFormat;

public class Q2_controle {

    @FXML
    private TextField arredondado;

    @FXML
    private TextField inicial;

    @FXML
    private TextField original;

    private static final NumberFormat uso = NumberFormat.getNumberInstance();
    
    double inicial_ = 0;
    double original_ =0;
    double arredondado_ =0;

    @FXML
    void calcularButton(ActionEvent event) {
        try{           
            inicial_ = Double.parseDouble(inicial.getText());
            arredondado_ = Math.floor(inicial_+0.5);
            original_ = (inicial_+0.5);  

            arredondado.setText(uso.format(arredondado_));
            original.setText(uso.format(original_));
            
            
        }catch(Exception e){
            inicial.setText("Escreva um numero!!");
        }
    }
    
}