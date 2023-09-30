package by.shtrudell.astontask.fxml;

import by.shtrudell.astontask.Util.AlertBox;
import by.shtrudell.astontask.algorithm.BracketsChecker;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class TaskFourController {
    @FXML
    private TextArea textArea;

    @FXML
    private void applyAction(ActionEvent actionEvent) {
        if(textArea.getText() == null || textArea.getText().isEmpty()) {
            AlertBox.display("Warning", "Поле ввода пустое");
            return;
        }

        if(BracketsChecker.isValid(textArea.getText())) {
            if(BracketsChecker.isCorrect(textArea.getText())) {
                AlertBox.display("Answer", "Скобочная последователдьность верна");
                return;
            }

            var mistakes = BracketsChecker.findMistakes(textArea.getText());
            StringBuilder sb = new StringBuilder(textArea.getText());

            for(var mistake : mistakes) {
                sb.insert(mistake.getKey(), mistake.getValue().toString());
            }

            AlertBox.display("Answer", "Последовательность неверна. Исправленный вариант: " + sb.toString());
        }
        else {
            AlertBox.display("Warning", "Неверный формат ввода");
        }
    }
}
