import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    private ConferenceRoom conferenceRoom;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom("Murray");
        }

    @Test
    public void canGetRoomName(){
        assertEquals("Murray", conferenceRoom.getRoomName());
    }



    }
