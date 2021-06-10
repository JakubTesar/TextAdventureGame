package presentation;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

import java.io.IOException;

public class YouDied {

    public Text restartButton;

    public void onClickRestartButton(MouseEvent mouseEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/Menu.fxml"));

        Scene scene = new Scene(root, 800, 600);

        Window.stage.setScene(scene);
    }
}
