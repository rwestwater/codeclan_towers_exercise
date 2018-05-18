public class ConferenceRoom extends Room{

    private String roomName;

    public ConferenceRoom(String roomName) {

        super(250);
        this.roomName = roomName;
    }

    public String getRoomName(){
        return "Murray";
    }
}
