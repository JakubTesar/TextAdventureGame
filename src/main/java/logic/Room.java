package logic;

public class Room {
    private String title;
    private String description;
    private boolean isInLobby;
    private boolean isInRoom1;
    private boolean isInRoom2;
    private boolean isInRoom3;
    private boolean isInRoom4;

    public Room(String title, String description, boolean isInRoom1, boolean isInRoom2, boolean isInRoom3, boolean isInRoom4, boolean isInLobby) {
        this.title = title;
        this.description = description;
        this.isInLobby = isInLobby;
        this.isInRoom1 = isInRoom1;
        this.isInRoom2 = isInRoom2;
        this.isInRoom3 = isInRoom3;
        this.isInRoom4 = isInRoom4;

    }

    public void setInRoom1(boolean inRoom1) {
        isInRoom1 = inRoom1;
    }

    public void setInRoom2(boolean inRoom2) {
        isInRoom2 = inRoom2;
    }

    public void setInRoom3(boolean inRoom3) {
        isInRoom3 = inRoom3;
    }

    public void setInRoom4(boolean inRoom4) {
        isInRoom4 = inRoom4;
    }
    public void setInLobby(boolean inLobby) {
        isInLobby = inLobby;
    }

    public boolean isInRoom1() {
        return isInRoom1;
    }

    public boolean isInRoom2() {
        return isInRoom2;
    }

    public boolean isInRoom3() {
        return isInRoom3;
    }

    public boolean isInRoom4() {
        return isInRoom4;
    }

    public boolean isInLobby() {
        return isInLobby;
    }


    private Room top;
    private Room left;
    private Room right;

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
    public Room getTop() {
        return top;
    }
    public void setTop(Room top) {
        this.top = top;
    }
    public Room getLeft() {
        return left;
    }
    public void setLeft(Room left) {
        this.left = left;
    }
    public Room getRight() {
        return right;
    }
    public void setRight(Room right) {
        this.right = right;
    }

}