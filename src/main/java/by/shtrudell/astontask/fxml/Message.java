package by.shtrudell.astontask.fxml;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class Message {
    @FXML
    private Text messageText;

    private EventHandler<ActionEvent> closeEvent;

    public void setCloseEvent(EventHandler<ActionEvent> closeEvent) {
        this.closeEvent = closeEvent;
    }

    public void setMessage(String message) {
        messageText.setText(message);
    }

    @FXML
    private void closeAction(ActionEvent actionEvent) {
        if(closeEvent != null)
            closeEvent.handle(null);
    }
}
