package sample;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXSnackbar;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private JFXButton bmiButton;

    @FXML
    private JFXButton dietChartButton;
    @FXML
    private JFXButton birthdayButton;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        bmiButton.setOnAction(event -> {
            new Main().bmiStage();
        });
        birthdayButton.setOnAction(event -> {
            new Main().dateOfBirthStage();
        });
//        dietChartButton.setOnAction(event -> {
//            new Main().dietChartStage();
//
//        });

    }


}
