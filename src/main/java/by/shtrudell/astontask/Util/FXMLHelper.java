package by.shtrudell.astontask.Util;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import by.shtrudell.astontask.TaskApp;

import java.io.IOException;

public class FXMLHelper {

    private static final String fxmlFolder = "/by/shtrudell/astontask/fxml/";

    public static Parent loadFXML(String fxml) throws IOException {
        return makeLoader(fxml).load();
    }

    public static FXMLLoader makeLoader(String fxml) {
        return new FXMLLoader(TaskApp.class.getResource(fxmlFolder + fxml + ".fxml"));
    }
}
