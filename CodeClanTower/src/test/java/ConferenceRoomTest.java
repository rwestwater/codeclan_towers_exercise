import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    private ConferenceRoom conferenceRoom;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom("Murray", 250.00);
        }

    @Test
    public void canGetRoomName(){
        assertEquals("Murray", conferenceRoom.getRoomName());
    }

    @Test
    public void canGetDailyRate(){
        assertEquals(250.00, conferenceRoom.getDailyRate(), 0.01);
    }
}
