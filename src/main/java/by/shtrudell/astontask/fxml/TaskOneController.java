package by.shtrudell.astontask.fxml;

import by.shtrudell.astontask.AlertBox;
import by.shtrudell.astontask.algorithm.NumChecker;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class TaskOneController {
    @FXML
    private TextArea textArea;
    @FXML
    private Button okButton;

    @FXML
    private void applyAction(ActionEvent actionEvent) {
        if(textArea.getText() == null || textArea.getText().isEmpty()) {
            AlertBox.display("Warning", "Поле ввода пустое");
            return;
        }

        try{
            int number = Integer.parseInt(textArea.getText());
            if(NumChecker.IsGreater(number, 7))
                AlertBox.display("Answer", "Привет!");
            else
                AlertBox.display("Answer", "Число не больше 7");
        }
        catch (NumberFormatException ex){
            AlertBox.display("Warning", "Введите число");
        }
    }
}
