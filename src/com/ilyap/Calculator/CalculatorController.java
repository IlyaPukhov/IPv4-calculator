package com.ilyap.Calculator;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;

public class CalculatorController {

    @FXML
    private TextField broadcastAddressField;

    @FXML
    private TextField hostsField;

    @FXML
    private TextField ipv4AddressField;

    @FXML
    private TextField maskField;

    @FXML
    private TextField networkAddressField;

    @FXML
    private TextField networkClassField;

    @FXML
    private Button resultsButton;

    @FXML
    void initialize() {
        resultsButton.setOnAction(actionEvent -> setResults(ipv4AddressField.getText()));
        ipv4AddressField.setOnKeyPressed(keyEvent -> {
            if (keyEvent.getCode() == KeyCode.ENTER) {
                setResults(ipv4AddressField.getText());
            }
        });
    }

    public void setResults(String address) {
        try {
            IPv4 ipv4 = new IPv4(address);
            maskField.setText(ipv4.getMask());
            hostsField.setText(ipv4.getHosts());
            networkAddressField.setText(ipv4.getNetworkAddress());
            broadcastAddressField.setText(ipv4.getBroadcastAddress());
            networkClassField.setText(ipv4.getNetworkClass());

        } catch (RuntimeException e) {
            ipv4AddressField.setText(e.getMessage());
        }

    }
}
