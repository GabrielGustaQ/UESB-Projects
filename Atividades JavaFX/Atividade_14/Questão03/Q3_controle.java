package Questão03;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import java.lang.Math;
import java.text.NumberFormat;

public class Q3_controle {

    @FXML
    private TextField centesimo;

    @FXML
    private TextField decimo;

    @FXML
    private TextField inicial;

    @FXML
    private TextField inteiro;

    @FXML
    private TextField milesimo;

    private static final NumberFormat uso = NumberFormat.getNumberInstance();

    double inicial_ = 0;
    double inteiro_ =0;
    double decimo_ =0;
    double centesimo_=0;
    double milesimo_ =0;

    @FXML
    void calcularButton(ActionEvent event) {
      try{           
            inicial_ = Double.parseDouble(inicial.getText());
            inteiro_ = Math.floor(inicial_+0.5);
            decimo_ = Math.floor(inicial_*10+0.5)/10;  
            centesimo_ = Math.floor(inicial_*100+0.5)/100;
            milesimo_ = Math.floor(inicial_*1000+0.5)/1000;
            
            inteiro.setText(uso.format(inteiro_));
            decimo.setText(uso.format(decimo_));
            centesimo.setText(uso.format(centesimo_));
            milesimo.setText(uso.format(milesimo_));
            
            
        }catch(Exception e){
            inicial.setText("Escreva um numero!!");
        }
    }
}

