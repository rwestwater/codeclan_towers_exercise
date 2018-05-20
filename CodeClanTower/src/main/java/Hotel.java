import java.util.ArrayList;

public class Hotel {

    private ArrayList<Room> collectionOfBedrooms;
    private ArrayList<DiningRoom> collectionOfDiningRooms;
    private ArrayList<ConferenceRoom> collectionOfConferenceRooms;
    private ArrayList<Guest> guestList;


    public Hotel(){
        collectionOfBedrooms = new ArrayList<>();
        collectionOfDiningRooms = new ArrayList<>();
        collectionOfConferenceRooms = new ArrayList<>();
        guestList = new ArrayList<>();
    }

    public int getCollectionOfBedrooms(){
        return this.collectionOfBedrooms.size();
    }

    public void addRoomToCollectionOfBedrooms(Room room){
        collectionOfBedrooms.add(room);
    }

    public int getCollectionOfDiningRooms() {
        return this.collectionOfDiningRooms.size();
    }

    public void addRoomToCollectionOfDiningRooms(DiningRoom diningRoom){
        collectionOfDiningRooms.add(diningRoom);
    }

    public int getCollectionOfConferenceRooms() {
        return this.collectionOfConferenceRooms.size();
    }

    public void addRoomToCollectionOfConferenceRooms(ConferenceRoom conferenceRoom){
        collectionOfConferenceRooms.add(conferenceRoom);
    }

    public int getGuestList() {
        return this.guestList.size();
    }

    public void checkInGuest(Guest guest){
        guestList.add(guest);
    }




}
