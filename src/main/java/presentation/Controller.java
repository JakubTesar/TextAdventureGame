package presentation;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.text.Text;
import logic.Room;

import javax.swing.text.html.ImageView;

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


    Room rooms = new Room("Lobby", "Hi go and die in the dungeon", false, false, false, false, true);

    // Room lobby = new Room("Lobby", "Hi go and die in the dungeon", true);
    // Room room1 = new Room("Chest room", "Go and open the chest :)", false);
    // Room room2 = new Room("Enemy", "Go and kill that fucker",false);
    // Room room3 = new Room("Enemy", "Kill that fat thing",false);
    // Room room4 = new Room("Lava", "Jump in the lava and die ",false);

    public void clickUpButt(ActionEvent actionEvent) {
        if (rooms.isInLobby()) {
            rooms.setInRoom1(true);
            rooms.setInLobby(false);
        }

        if (rooms.isInRoom1()) {
            title.setText("Chest room");//ROOM1
            description.setText("Go and open the chest :)");
        }
    }

    public void clickDownButt(ActionEvent actionEvent) {
        if (rooms.isInRoom1()) {
            rooms.setInRoom1(false);
            rooms.setInLobby(true);
        }

        if (rooms.isInLobby()) {
            title.setText("Lobby");//ROOM2
            description.setText("Hi go and die in the dungeon");
        }
    }

    public void clickRightButt(ActionEvent actionEvent) {
        countRight++;
        if (rooms.isInRoom4()) {
            title.setText("Lobby");
            description.setText("Hi go and die in the dungeon");
            rooms.setInLobby(true);
            rooms.setInRoom4(false);
        }
        if (rooms.isInLobby()) {
            rooms.setInRoom3(true);
            rooms.setInLobby(false);
        }

        if (rooms.isInRoom3() && countRight == 2) {
            title.setText("Enemy");//ROOM3
            description.setText("Go and kill that fucker");
            countRight = 0;
        }
    }

    public void clickLeftButt(ActionEvent actionEvent) {
        countLeft += 1;

        if (rooms.isInRoom3()) {
            title.setText("Lobby");
            description.setText("Hi go and die in the dungeon");
            rooms.setInLobby(true);
            rooms.setInRoom3(false);
        }
        if (rooms.isInLobby()) {
            rooms.setInRoom4(true);
            rooms.setInLobby(false);
        }

        if (rooms.isInRoom4() && countLeft == 2) {
            title.setText("Lava");//ROOM4
            description.setText("Jump in the lava and die ");
            countLeft = 0;
        }

        Image image = new Image("IssacEnemy.jpg");
        imageview.setImage(image);
    }
}
