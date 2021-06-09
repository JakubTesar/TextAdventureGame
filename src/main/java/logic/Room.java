package logic;


import javafx.scene.image.Image;

public class Room {
    private String title;
    private String description;
    private boolean isInRoom;
    private Image image;
    private boolean canKill;


    public Room(String title, String description, boolean isInRoom, Image image, boolean canKill) {
        this.title = title;
        this.description = description;
        this.isInRoom = isInRoom;
        this.image = image;
        this.canKill = canKill;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setInRoom(boolean inRoom) {
        isInRoom = inRoom;
    }

    public boolean isInRoom() {
        return isInRoom;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public boolean isCanKill() {
        return canKill;
    }
}