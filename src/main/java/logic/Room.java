package logic;

public class Room {
    private String title;
    private String description;
    private boolean isInRoom;


    public Room(String title, String description, boolean isInRoom) {
        this.title = title;
        this.description = description;
        this.isInRoom = isInRoom;
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
}