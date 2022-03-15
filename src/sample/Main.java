package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;




public class Main extends Application {

    Stage stage;
    @Override
    public void start(Stage primaryStage) throws Exception{
        this.stage = primaryStage;
        mainStage();
    }
    public void mainStage(){

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("sample.fxml"));
            AnchorPane anchorPane = fxmlLoader.load();
            Scene scene = new Scene(anchorPane);
            stage.setScene(scene);
            stage.show();
        } catch (Exception janiNaException) {
            janiNaException.getMessage();
        }


    }

    public void bmiStage(){

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("bmi.fxml"));
            AnchorPane anchorPane = fxmlLoader.load();
            Scene scene = new Scene(anchorPane);
            Stage bmiStage = new Stage();
            bmiStage.setScene(scene);
            bmiStage.show();
        } catch (Exception janiNaException) {
            janiNaException.getMessage();
        }


    }
    public void dateOfBirthStage(){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("dateofbirth.fxml"));
            AnchorPane anchorPane = fxmlLoader.load();
            Scene scene = new Scene(anchorPane);
            Stage dofStage = new Stage();
            dofStage.setScene(scene);
            dofStage.show();
        } catch (Exception janiNaException) {
            janiNaException.getMessage();
        }
    }



    public static void main(String[] args) {
        launch(args);
    }

}
