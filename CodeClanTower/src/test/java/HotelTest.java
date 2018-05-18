import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Guest guest;
    Room room;

    @Before
    public void before(){
        hotel = new Hotel();
        guest = new Guest("Rachel");
    }

    @Test
    public void getCollectionOfBedrooms(){
        assertEquals(0, hotel.getCollectionOfBedrooms());
    }

    @Test
    public void addCollectionOfBedrooms(){
        hotel.addRoomToCollectionOfBedrooms(room);
        assertEquals(1, hotel.getCollectionOfBedrooms());
    }




}
