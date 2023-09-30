package by.shtrudell.astontask.fxml;

import by.shtrudell.astontask.AlertBox;
import by.shtrudell.astontask.algorithm.NumChecker;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaskThreeController {
    @FXML
    private TextArea textArea;
    @FXML
    private Button okButton;

    @FXML
    private void applyAction(ActionEvent actionEvent) {
        if(textArea.getText() == null || textArea.getText().isEmpty()) {
            AlertBox.display("Warning", "Поле ввода пустое");
        }

        try {
            int[] numArr = Arrays.stream(textArea.getText().split(" ")).mapToInt(Integer::parseInt).toArray();

            List<Integer> multOfTree = new ArrayList<>();

            for (int i= 0; i < numArr.length; i++) {
                if(NumChecker.MultipleOf(3, numArr[i] ))
                    multOfTree.add(numArr[i]);
            }

            AlertBox.display("Answer", Arrays.toString(multOfTree.toArray()));
        }
        catch (NumberFormatException ex){
            AlertBox.display("Warning", "Неверный формат ввода");
        }
    }
}
