package sample;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class bmiController implements Initializable {
    @FXML
    private JFXTextField height;

    @FXML
    private JFXTextField weight;

    @FXML
    private JFXButton bmiCalculateButton;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void bmiCalculationStage() {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("calculateBMI.fxml"));
            AnchorPane anchorPane = fxmlLoader.load();
            CalculateBMI calculateBMI = fxmlLoader.getController();
            calculateBMI.transferFieldData(bmiCalculate());
            Scene scene = new Scene(anchorPane);
            Stage bmiStage = new Stage();
            bmiStage.setScene(scene);
            bmiStage.show();
        } catch (Exception janiNaException) {
            janiNaException.getMessage();
        }
    }
    private float bmiCalculate(){
        float heightValue = Float.parseFloat(height.getText());
        float weightValue = Float.parseFloat(weight.getText());
        return weightValue/(heightValue*heightValue);
    }
}
