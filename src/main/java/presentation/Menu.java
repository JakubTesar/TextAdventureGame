package presentation;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import presentation.Controller;
import logic.Room;

import java.io.IOException;

public class Menu {
    Controller con = new Controller();

    public void playButtonClick(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/Game.fxml"));

        Scene scene = new Scene(root, 800, 600);

        Window.stage.setScene(scene);
    }
}
