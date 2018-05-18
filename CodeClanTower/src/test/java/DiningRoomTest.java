import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DiningRoomTest {
    private DiningRoom diningRoom;

    @Before
    public void before() {
        diningRoom = new DiningRoom("McCallum");
    }

    @Test
    public void canGetRoomName() {
        assertEquals("McCallum", diningRoom.getRoomName());
    }
}