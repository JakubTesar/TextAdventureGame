package presentation;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import logic.Room;

import java.io.IOException;

public class Controller {
    public Button leftButt;
    public Button downButt;
    public Button upButt;
    public Button rightButt;
    public Text description;
    public Text title;
    public ImageView imageview;
    public Button killButton;

    Image imageRoom = new Image("/Room.jpg");
    Image imageChest = new Image("/ChestMinecraft.jpg");
    Image imageIssac = new Image("/IssacEnemy.jpg");
    Image imageIssac2 = new Image("/FatFuck.jpg");
    Image imageLava = new Image("/Lava.jpg");

    Room lobby = new Room("Lobby", "Hi go and die in the dungeon", true, imageRoom, false);
    Room room1 = new Room("Chest room", "Go and open the chest :)", false, imageChest, false);
    Room room2 = new Room("Enemy", "Go and kill that fucker", false, imageIssac, true);
    Room room3 = new Room("Enemy", "Kill that fat thing", false, imageIssac2, true);
    Room room4 = new Room("Lava", "Jump in the lava and die", false, imageLava, true);
    Room room5 = new Room("Anita", "Anita the epic skeleton girl boss", false, imageLava, true);

    public void setKillButton(Room room) {
        if (room.isCanKill()) {
            killButton.setText("Kill");
            killButton.setVisible(true);
        }
    }

    public void movingIf(Room roomFrom, Room roomTo) {
        if (lobby.isInRoom()) {
            imageview.setImage(roomTo.getImage());
            roomFrom.setInRoom(false);
            roomTo.setInRoom(true);
            title.setText(roomTo.getTitle());
            description.setText(roomTo.getDescription());
            setKillButton(roomTo);
        }
    }

    public void movingIfLobby(Room room) {
        if (room.isInRoom()) {
            setLobby();
            room.setInRoom(false);
        }
    }

    public void setLobby() {
        imageview.setImage(lobby.getImage());
        lobby.setInRoom(true);
        title.setText(lobby.getTitle());
        description.setText(lobby.getDescription());
    }

    public void clickUpButt(ActionEvent actionEvent) {
        movingIf(lobby, room1);
        movingIfLobby(room3);
    }

    public void clickDownButt(ActionEvent actionEvent) {
        movingIf(room3, room5);
        movingIf(lobby, room3);
        movingIfLobby(room1);
    }

    public void clickRightButt(ActionEvent actionEvent) throws IOException {
        movingIf(lobby, room2);
        movingIfLobby(room4);
    }

    public void clickLeftButt(ActionEvent actionEvent) {
        movingIf(lobby, room4);
        movingIfLobby(room2);
    }

    public void onClickKillButton(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/YouDied.fxml"));

        Scene scene = new Scene(root, 800, 600);

        Window.stage.setScene(scene);
    }
}


