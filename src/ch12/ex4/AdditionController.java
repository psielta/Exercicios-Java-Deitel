package ch12.ex4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AdditionController {

    @FXML
    private TextField i1TextField;

    @FXML
    private TextField i2TextField;

    @FXML
    private Label resultLabel;

    @FXML
    void calculateButton(ActionEvent event) {
        int i1 = 0, i2 = 0;
        boolean conteudoTextField1EstaCorreto = false;
        boolean conteudoTextField2EstaCorreto = false;
        try {
            i1 = Integer.parseInt(i1TextField.getText());
            conteudoTextField1EstaCorreto = true;
        } catch (NumberFormatException e) {
            i1TextField.setText("Apenas numeros inteiros.");
            i1TextField.selectAll();
            i1TextField.requestFocus();
        }
        try {
            i2 = Integer.parseInt(i2TextField.getText());
            conteudoTextField2EstaCorreto = true;
        } catch (NumberFormatException e) {
            i2TextField.setText("Apenas numeros inteiros.");
            i2TextField.selectAll();
            i2TextField.requestFocus();
        }
        if (conteudoTextField1EstaCorreto && conteudoTextField2EstaCorreto)
            resultLabel.setText(String.valueOf(i1 + i2));
    }

}
