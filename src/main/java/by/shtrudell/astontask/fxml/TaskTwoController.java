package by.shtrudell.astontask.fxml;

import by.shtrudell.astontask.Util.AlertBox;
import by.shtrudell.astontask.algorithm.NameChecker;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class TaskTwoController {
    @FXML
    private TextArea textArea;

    @FXML
    private void applyAction(ActionEvent actionEvent) {
        if(textArea.getText() == null || textArea.getText().isEmpty()) {
            AlertBox.display("Warning", "Поле ввода пустое");
            return;
        }

        if(NameChecker.isValid(textArea.getText()))
            AlertBox.display("Answer", "Привет, " + NameChecker.validName);
        else
            AlertBox.display("Answer", "Нет такого имени");

    }
}
