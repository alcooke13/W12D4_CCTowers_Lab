import ccTowers.Bedroom;
import ccTowers.RoomType;
import guests.Guest;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class BedroomTest {
    private Bedroom bedroom;
    private Guest guest1;
    private Guest guest2;
    private Guest guest3;

    @Before
    public void before(){
        bedroom = new Bedroom(RoomType.SINGLE, 12);
        guest1 = new Guest("Cordu");
        guest2 = new Guest("Alistair");
        guest3 = new Guest("James");
    }

    @Test
    public void canGetEnumCapacity(){
        assertEquals(1, bedroom.getEnumRoomCapacity());
    }

    @Test
    public void canGetRoomNumber(){
        assertEquals(12, bedroom.getRoomNumber());
    }



    @Test
    public void getGuestCount(){
        assertEquals(0, bedroom.guestCount());
    }

    @Test
    public void canAddGuest(){
        bedroom.addGuest(guest1);
        assertEquals(1, bedroom.guestCount());
    }

    @Test
    public void onlyAddGuestToCapacity(){
        bedroom.addGuest(guest1);
        bedroom.addGuest(guest2);
        bedroom.addGuest(guest3);
        assertEquals(1, bedroom.guestCount());
    }
}
