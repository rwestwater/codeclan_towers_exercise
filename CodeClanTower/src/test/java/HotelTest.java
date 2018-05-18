import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Guest guest;
    Room room;
    DiningRoom diningRoom;
    ConferenceRoom conferenceRoom;

    @Before
    public void before(){
        hotel = new Hotel();
        guest = new Guest("Rachel");
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




}
