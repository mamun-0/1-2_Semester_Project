package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class CalculateBMI implements Initializable {
    @FXML
    private Label bmiValue;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void transferFieldData(float bmi) {
        bmiValue.setText(String.valueOf(bmi));
    }
}
