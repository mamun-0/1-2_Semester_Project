package sample;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXSnackbar;
import com.jfoenix.controls.JFXTextField;
import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.util.Duration;

import java.net.URL;
import java.time.LocalDate;
import java.time.Period;
import java.util.ResourceBundle;

public class DateOfBirth implements Initializable {

    @FXML
    private JFXTextField nameField;

    @FXML
    private ToggleGroup toggle;

    @FXML
    private JFXDatePicker dateField;

    @FXML
    private JFXButton submitButton;

    @FXML
    private HBox hbox;

    @FXML
    private VBox firstVbox;

    @FXML
    private Label name;

    @FXML
    private Label gender;

    @FXML
    private VBox secondVbox;

    @FXML
    private Label year;

    @FXML
    private Label month;

    @FXML
    private Label day;

//    String name = nameField.getText();
//    RadioButton radioButton = (RadioButton) toggle.getSelectedToggle();
//    String selectedToggle = radioButton.getText();


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        FadeTransition f = new FadeTransition(Duration.seconds(0.5),hbox);
        f.setToValue(0);
        f.setFromValue(1);
        f.play();


        submitButton.setOnAction(event -> {
            showYearsMonthsDays();
            showName();
            showGender();
            showYear();
            showMonth();
            showDay();
        });

    }

    private String showGender() {
        RadioButton radioButton = (RadioButton) toggle.getSelectedToggle();
        String selectedToggle = radioButton.getText();
        return "Gender : "+selectedToggle;
    }

    private String showName() {
        return "Name : "+nameField.getText();
    }

    private String showYear(){
        return "Years : "+ getPeriod().getYears();
    }
    private String showMonth(){
        return "Months : "+ getPeriod().getMonths();
    }
    private String showDay(){
        return "Days : " + getPeriod().getDays();
    }

    private void showYearsMonthsDays() {
        year.setText(showYear());
        month.setText(showMonth());
        day.setText(showDay());
        name.setText(showName());
        gender.setText(showGender());
        hbox.setVisible(true);
        FadeTransition f = new FadeTransition(Duration.seconds(2),hbox);
        f.setToValue(1);
        f.setFromValue(0);
        f.play();

    }


    private Period getPeriod(){
        LocalDate localDate = LocalDate.now();
        LocalDate userInputDateField = dateField.getValue();
        Period period = Period.between(userInputDateField,localDate);
        return period;
    }
}
