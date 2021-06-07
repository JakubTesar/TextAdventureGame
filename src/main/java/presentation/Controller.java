package presentation;

import javafx.event.ActionEvent;
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
    public int countLeft = 0;
    public int countRight = 0;

    Room lobby = new Room("Lobby", "Hi go and die in the dungeon", true);
    Room room1 = new Room("Chest room", "Go and open the chest :)", false);
    Room room2 = new Room("Enemy", "Go and kill that fucker", false);
    Room room3 = new Room("Enemy", "Kill that fat thing", false);
    Room room4 = new Room("Lava", "Jump in the lava and die ", false);

    public void setLobby(){
        Image image = new Image("/Room.jpg");
        imageview.setImage(image);
        lobby.setInRoom(true);
        title.setText(lobby.getTitle());
        description.setText(lobby.getDescription());
    }

    public void clickUpButt(ActionEvent actionEvent) {
        if (lobby.isInRoom()) {
            Image image = new Image("/ChestMinecraft.jpg");
            imageview.setImage(image);
            lobby.setInRoom(false);
            room1.setInRoom(true);
            title.setText(room1.getTitle());
            description.setText(room1.getDescription());
        }
    }
    public void clickDownButt(ActionEvent actionEvent) {
        if (room1.isInRoom()){
            setLobby();
            room1.setInRoom(false);

        }
    }
    public void clickRightButt(ActionEvent actionEvent) throws IOException {
        if (lobby.isInRoom()) {
            Image image = new Image("/IssacEnemy.jpg");
            imageview.setImage(image);
            lobby.setInRoom(false);
            room2.setInRoom(true);
            title.setText(room2.getTitle());
            description.setText(room2.getDescription());
        }
        if (room4.isInRoom()){
            setLobby();
            room4.setInRoom(false);
        }
    }
    public void clickLeftButt(ActionEvent actionEvent) {
        if (lobby.isInRoom()) {
            Image image = new Image("/Lava.jpg");
            imageview.setImage(image);
            lobby.setInRoom(false);
            room4.setInRoom(true);
            title.setText(room4.getTitle());
            description.setText(room4.getDescription());
        }
        if (room2.isInRoom()){
            setLobby();
            room2.setInRoom(false);
        }
    }

}


