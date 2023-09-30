package by.shtrudell.astontask.fxml;

import by.shtrudell.astontask.AlertBox;
import by.shtrudell.astontask.algorithm.NumChecker;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import java.util.Arrays;

public class TaskFourController {
    @FXML
    private TextArea textArea;
    @FXML
    private Button okButton;

    @FXML
    private void initialize() {

    }

    @FXML
    private void applyAction(ActionEvent actionEvent) {
        if(textArea.getText() == null || textArea.getText().isEmpty()) {
            AlertBox.display("Warning", "Поле ввода пустое");
            return;
        }
    }
}
