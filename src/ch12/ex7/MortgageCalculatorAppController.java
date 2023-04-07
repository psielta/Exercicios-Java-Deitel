package ch12.ex7;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculatorAppController {
    private MathContext mathContext = new MathContext(2);
    private BigDecimal anos = BigDecimal.valueOf(20);
    private final NumberFormat numberFormat = NumberFormat.getCurrencyInstance();

    @FXML
    private TextField vlEmprestimoTextField;

    @FXML
    private TextField vlParcelaTextField;

    @FXML
    private TextField entradaTextField;

    @FXML
    private Slider tempoSlider;

    @FXML
    private TextField txJurosTextField;

    @FXML
    private TextField vlTotalTextField;

    @FXML
    private Label tempoLabel;
    @FXML
    private Button btParcelas;

    @FXML
    void calcularButton(ActionEvent event) {
        boolean t1 = false, t2 = false;
        try {
            t1 = true;
            BigDecimal vlTotal = new BigDecimal(vlTotalTextField.getText());
            t1 = false;
            t2 = true;
            BigDecimal vlEntrada = new BigDecimal(entradaTextField.getText());
            t2 = false;
            BigDecimal txJuros = BigDecimal.valueOf(Double.parseDouble(txJurosTextField.getText()) / 100);
            BigDecimal qtdeMeses = anos.multiply(BigDecimal.valueOf(12));

            BigDecimal vlEmprestimo = vlTotal.subtract(vlEntrada);
            BigDecimal vlParcela = (vlEmprestimo.divide(qtdeMeses, 6, RoundingMode.HALF_UP)).add(vlEmprestimo.multiply(txJuros.divide(BigDecimal.valueOf(12), 6, RoundingMode.HALF_UP)));

            vlEmprestimoTextField.setText(numberFormat.format(calculaVlTotalEmprestimo(vlEmprestimo, txJuros, anos)));
            vlParcelaTextField.setText(numberFormat.format(vlParcela));

        } catch (IllegalArgumentException e) {
            if (t1) {
                vlTotalTextField.setText("Insira vl. total");
                txJurosTextField.setText("Insira tx. juros");
                entradaTextField.setText("Insira entrada");
                vlTotalTextField.selectAll();
                vlTotalTextField.requestFocus();
            } else if (t2) {
                entradaTextField.setText("Insira entrada");
                txJurosTextField.setText("Insira tx. juros");
                entradaTextField.selectAll();
                entradaTextField.requestFocus();
            } else {
                txJurosTextField.setText("Insira tx. juros");
                txJurosTextField.selectAll();
                txJurosTextField.requestFocus();
            }
        }
    }

    public void initialize() {
        tempoSlider.valueProperty().addListener(
                new ChangeListener<Number>() {
                    @Override
                    public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                        anos = BigDecimal.valueOf(newValue.intValue());
                        tempoLabel.setText(anos.toString().concat(" anos"));
                    }
                });
    }

    public BigDecimal calculaVlTotalEmprestimo(BigDecimal vlEmprestimo, BigDecimal txJuros, BigDecimal qtdeAnos) {
        BigDecimal saldoDevedor = vlEmprestimo;
        System.out.println(vlEmprestimo);
        BigDecimal vlParcela = vlEmprestimo.divide(qtdeAnos.multiply(BigDecimal.valueOf(12)), 6, RoundingMode.HALF_UP);
        System.out.println(vlParcela);
        double txJurosMensal = txJuros.doubleValue() / 12;
        BigDecimal vlTotal = BigDecimal.ZERO;
        MortgageCalculatorApp.dados = "";

        for (int i = 1; i <= qtdeAnos.intValue() * 12; i++) {
            BigDecimal nvVlParcela = vlParcela.add(saldoDevedor.multiply(BigDecimal.valueOf(txJurosMensal)));
            System.out.println(nvVlParcela);
            vlTotal = vlTotal.add(nvVlParcela);
            saldoDevedor = saldoDevedor.subtract(nvVlParcela);

            String format = String.format("Parcela %d: %s%n", i, NumberFormat.getCurrencyInstance().format(nvVlParcela));
            MortgageCalculatorApp.dados = MortgageCalculatorApp.dados.concat(format);
        }
        return vlTotal;
    }

    @FXML
    void parcelasButton(ActionEvent event) {
        MortgageCalculatorApp.changeScreen("details");
    }
}
