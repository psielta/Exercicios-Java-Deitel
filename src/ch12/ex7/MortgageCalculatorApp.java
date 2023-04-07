package ch12.ex7;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MortgageCalculatorApp extends Application {
    private static Stage stage;
    public static String dados = "";

    private static Scene mainScene;
    private static Scene detailsScene;
    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        Parent primaryRoot = FXMLLoader.load(getClass().getResource("MortgageCalculatorApp.fxml"));
        Parent secondRoot = FXMLLoader.load(getClass().getResource("MortgageCalculatorAppTextArea.fxml"));

        Scene secondScene = new Scene(secondRoot);
        mainScene = new Scene(primaryRoot);
        Scene primaryScene = mainScene;
        detailsScene = secondScene;

        primaryStage.setScene(primaryScene);
        primaryStage.setTitle("Calculadora de hipoteca");
        primaryStage.show();

        /*
        Scene secondScene = new Scene(secondRoot);
        Stage secondStage = new Stage();
        secondStage.setTitle("Parcelas");
        secondStage.show();*/
    }
    public static void changeScreen(String scr){
        switch (scr){
            case "main":
                stage.setScene(mainScene);
            case "details":
                stage.setScene(detailsScene);
        }
    }
    public static void main(String[] args) {
        launch();
    }
}
