package controle;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;

import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.XYChart;

public class tela3controle {

    @FXML
    private BarChart <String, Integer> barChart; 
    
    @FXML
    private CategoryAxis xAxis;

    
    public void initialize(URL url, ResourceBundle rb){
        XYChart.Series<String, Integer> series = new XYChart.Series<>();        
        series.setName("2021");
        series.getData().add(new XYChart.Data<>("Janeiro", 27));
        series.getData().add(new XYChart.Data<>("Março", 18));
        series.getData().add(new XYChart.Data<>("Abril", 35));
        barChart.getData().add(series);

    }
}
