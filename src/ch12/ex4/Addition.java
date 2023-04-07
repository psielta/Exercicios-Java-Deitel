package ch12.ex4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.regex.Pattern;

public class Addition extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent load = FXMLLoader.load(getClass().getResource("Addition.fxml"));
        Scene scene = new Scene(load);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Adição");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}