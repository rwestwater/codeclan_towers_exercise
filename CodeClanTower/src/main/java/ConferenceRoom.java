public class ConferenceRoom extends Room{

    private String roomName;
    private double dailyRate;

    public ConferenceRoom(String roomName, double dailyRate) {

        super(250);
        this.roomName = roomName;
        this.dailyRate = dailyRate;
    }

    public String getRoomName(){
        return "Murray";
    }

    public double getDailyRate() {
        return dailyRate;
    }
}
