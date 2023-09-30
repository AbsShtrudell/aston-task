package by.shtrudell.astontask;

import by.shtrudell.astontask.fxml.FXMLHelper;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class TaskApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Parent navigate = FXMLHelper.loadFXML("navigate-view");
        Scene scene = new Scene(navigate);
        stage.setTitle("Aston Task");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}