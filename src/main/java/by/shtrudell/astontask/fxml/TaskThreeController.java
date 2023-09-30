package by.shtrudell.astontask.fxml;

import by.shtrudell.astontask.Util.AlertBox;
import by.shtrudell.astontask.algorithm.NumChecker;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaskThreeController {
    @FXML
    private TextArea textArea;

    @FXML
    private void applyAction(ActionEvent actionEvent) {
        if(textArea.getText() == null || textArea.getText().isEmpty()) {
            AlertBox.display("Warning", "Поле ввода пустое");
        }

        try {
            int[] numArr = Arrays.stream(textArea.getText().split(" ")).mapToInt(Integer::parseInt).toArray();

            List<Integer> multOfTree = new ArrayList<>();

            for (int i= 0; i < numArr.length; i++)
                if(NumChecker.multipleOf(NumChecker.multipleOfNum, numArr[i]))
                    multOfTree.add(numArr[i]);

            AlertBox.display("Answer", Arrays.toString(multOfTree.toArray()));
        }
        catch (NumberFormatException ex){
            AlertBox.display("Warning", "Неверный формат ввода");
        }
    }
}
