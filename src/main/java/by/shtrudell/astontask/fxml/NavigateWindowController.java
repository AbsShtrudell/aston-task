package by.shtrudell.astontask.fxml;

import by.shtrudell.astontask.Util.FXMLHelper;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class NavigateWindowController {
    @FXML
    private AnchorPane taskOnePane;
    @FXML
    private AnchorPane taskTwoPane;
    @FXML
    private AnchorPane taskThreePane;
    @FXML
    private AnchorPane taskFourPane;

    @FXML
    private void initialize() {
        try {
            taskOnePane.getChildren().add(FXMLHelper.loadFXML("task1"));
            taskTwoPane.getChildren().add(FXMLHelper.loadFXML("task2"));
            taskThreePane.getChildren().add(FXMLHelper.loadFXML("task3"));
            taskFourPane.getChildren().add(FXMLHelper.loadFXML("task4"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
