package ch12.ex5;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ScrapbookingApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("ScrapbookingApp.fxml"));
        Scene scene = new Scene  (root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Scrapbooking App");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
