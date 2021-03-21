package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;


public class Controller {
    @FXML public TextArea textAria;
    @FXML public javafx.scene.control.TextField textField;

    public void sendMSG(ActionEvent actionEvent) {
        textAria.appendText(textField.getText() + '\n');
        textField.setText("");
    }
}
