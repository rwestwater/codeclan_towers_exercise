public class DiningRoom extends Room{

    private String roomName;

    public DiningRoom(String roomName) {

        super(250);
        this.roomName = roomName;
    }

    public String getRoomName(){
        return "McCallum";
    }
}
