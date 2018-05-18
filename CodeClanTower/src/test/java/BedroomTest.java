import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom(101, BedroomType.DOUBLE, 60.00);
    }

    @Test
    public void canGetRoomNo(){
        assertEquals(101, bedroom.getRoomNo());
    }

    @Test
    public void canGetRate(){
        assertEquals(60, bedroom.getRate(), 0.01);
    }

    @Test
    public void canGetCapacity(){
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void canGetBedroomType(){
        assertEquals(BedroomType.DOUBLE, bedroom.getBedroomType());
    }
}
