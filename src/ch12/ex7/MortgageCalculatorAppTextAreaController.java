/*
package ch12.ex7;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

import java.awt.event.ActionEvent;

public class MortgageCalculatorAppTextAreaController {


    @FXML
    void btVoltar(ActionEvent event) {

    }

}
*/
package ch12.ex7;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class MortgageCalculatorAppTextAreaController {
    @FXML
    protected TextArea parcelaTextArea;
    @FXML
    void btVoltar(ActionEvent event) {
        parcelaTextArea.setText(MortgageCalculatorApp.dados);
    }

}
