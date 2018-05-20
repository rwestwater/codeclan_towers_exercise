import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Guest guest;
    Bedroom bedroom;
    Room room;
    DiningRoom diningRoom;
    ConferenceRoom conferenceRoom;

    @Before
    public void before(){
        hotel = new Hotel();
        guest = new Guest("Rachel");
        bedroom = new Bedroom(500, BedroomType.SINGLE, 50.00);
        diningRoom = new DiningRoom("McCallum");
        conferenceRoom = new ConferenceRoom("Murray", 250.00);
    }

    @Test
    public void getCollectionOfBedrooms(){
        assertEquals(0, hotel.getCollectionOfBedrooms());
    }

    @Test
    public void addRoomToCollectionOfBedrooms(){
        hotel.addRoomToCollectionOfBedrooms(room);
        hotel.addRoomToCollectionOfBedrooms(room);
        hotel.addRoomToCollectionOfBedrooms(room);
        hotel.addRoomToCollectionOfBedrooms(room);
        hotel.addRoomToCollectionOfBedrooms(room);
        assertEquals(5, hotel.getCollectionOfBedrooms());
    }

    @Test
    public void addRoomToCollectionOfDiningRooms(){
        hotel.addRoomToCollectionOfDiningRooms(diningRoom);
        hotel.addRoomToCollectionOfDiningRooms(diningRoom);
        assertEquals(2, hotel.getCollectionOfDiningRooms());
    }

    @Test
    public void addRoomToCollectionOfConferenceRooms(){
        hotel.addRoomToCollectionOfConferenceRooms(conferenceRoom);
        assertEquals(1, hotel.getCollectionOfConferenceRooms());
    }

    @Test
    public void getGuestList(){
        assertEquals(0, hotel.getGuestList());
    }

    @Test
    public void canCheckInGuests() {
        hotel.checkInGuest(guest);
        hotel.checkInGuest(guest);
        assertEquals(2, hotel.getGuestList());
    }

    @Test
    public void canCheckGuestsInRoom() {
        hotel.checkInGuest(room, guest);
        hotel.checkInGuest(room, guest);
        assertEquals(2, hotel.guestsInRoom(room));
    }

    @Test
    public void canCheckOutGuests(){
        hotel.checkInGuest(room, guest);
        hotel.checkInGuest(room, guest);
        hotel.checkOutGuests(room, guest);
        assertEquals(1, room.guestsInRoom().size());

    }





}
