import java.util.ArrayList;



public class Hotel {

    private ArrayList<Room> collectionOfBedrooms;
    private ArrayList<Guest> guestList;

    public Hotel(){
        collectionOfBedrooms = new ArrayList<>();
        guestList = new ArrayList<>();
    }

    public int getCollectionOfBedrooms(){
        return this.collectionOfBedrooms.size();
    }

    public void addRoomToCollectionOfBedrooms(Room room){
        collectionOfBedrooms.add(room);
    }





}
