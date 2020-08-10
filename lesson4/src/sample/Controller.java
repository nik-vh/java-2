package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    TextArea mainTextArea;
    @FXML
    TextField messageField;

    public void sendMassage() {
        if (messageField.getText().length() != 0) {
            mainTextArea.appendText(messageField.getText()+"\n");
            messageField.clear();
            messageField.requestFocus();
        }
    }
}