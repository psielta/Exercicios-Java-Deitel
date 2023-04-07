package ch12.ex6.TipCalculator;// TipCalculatorController.java
// Controller that handles calculateButton and tipPercentageSlider events

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;

public class TipCalculatorController {
    // formatters for currency and percentages
    private static final NumberFormat currency =
            NumberFormat.getCurrencyInstance();
    private static final NumberFormat percent =
            NumberFormat.getPercentInstance();
    private BigDecimal tipPercentage = new BigDecimal(0.15); // 15% default

    // GUI controls defined in FXML and used by the controller's code
    @FXML
    private TextField amountTextField;

    @FXML
    private Label tipPercentageLabel;
    @FXML
    private TextField numberOfPersonTextField;

    @FXML
    private Slider tipPercentageSlider;

    @FXML
    private TextField tipTextField;

    @FXML
    private TextField totalTextField;

    // calculates and displays the tip and total amounts
    @FXML
    private void calculateButtonPressed(ActionEvent event) {
        try {
            BigDecimal amount = new BigDecimal(amountTextField.getText());
            BigDecimal numberOfPersons = new BigDecimal(numberOfPersonTextField.getText());

            BigDecimal tip = amount.multiply(tipPercentage).divide(numberOfPersons);
            BigDecimal total = amount.divide(numberOfPersons).add(tip);

            tipTextField.setText(currency.format(tip));
            totalTextField.setText(currency.format(total));
        } catch (NumberFormatException | ArithmeticException ex) {
            amountTextField.setText("Enter amount");
            numberOfPersonTextField.setText("Enter number of persons");
            amountTextField.selectAll();
            amountTextField.requestFocus();
        }
    }

    // called by FXMLLoader to initialize the controller
    public void initialize() {
        // 0-4 rounds down, 5-9 rounds up
        currency.setRoundingMode(RoundingMode.HALF_UP);

        // listener for changes to tipPercentageSlider's value
        tipPercentageSlider.valueProperty().addListener(
                new ChangeListener<Number>() {
                    @Override
                    public void changed(ObservableValue<? extends Number> ov,
                                        Number oldValue, Number newValue) {
                        tipPercentage =
                                BigDecimal.valueOf(newValue.intValue() / 100.0);
                        tipPercentageLabel.setText(percent.format(tipPercentage));
                    }
                }
        );
    }
}

/**************************************************************************
 * (C) Copyright 1992-2018 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
