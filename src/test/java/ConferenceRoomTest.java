import ccTowers.ConferenceRoom;
import ccTowers.RoomType;
import guests.Guest;
import org.junit.Before;
import org.junit.Test;

import static ccTowers.RoomType.CONFERENCEROOM;
import static org.junit.Assert.*;

public class ConferenceRoomTest {

    private ConferenceRoom conferenceRoom;
    private Guest guest1;
    private Guest guest2;
    private Guest guest3;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom(RoomType.CONFERENCEROOM, "The Magenta Room", false);
        guest1 = new Guest("Cordu");
        guest2 = new Guest("Alistair");
        guest3 = new Guest("James");
    }

    @Test
    public void canGetEnumCapacity(){
        assertEquals(2, conferenceRoom.getEnumRoomCapacity());
    }

    @Test
    public void canGetName(){
        assertEquals("The Magenta Room", conferenceRoom.getName());
    }

    @Test
    public void getIsSnacksProvided(){
        assertFalse(conferenceRoom.isSnacksProvided());
    }

    @Test
    public void getGuestCount(){
        assertEquals(0, conferenceRoom.guestCount());
    }

    @Test
    public void canAddGuest(){
        conferenceRoom.addGuest(guest1);
        assertEquals(1, conferenceRoom.guestCount());
    }

    @Test
    public void onlyAddGuestToCapacity(){
        conferenceRoom.addGuest(guest1);
        conferenceRoom.addGuest(guest2);
        conferenceRoom.addGuest(guest3);
        assertEquals(2, conferenceRoom.guestCount());
    }
    @Test
    public void roomStartsAsNotBooked(){
        assertFalse(conferenceRoom.isBooked());
    }
    @Test
    public void roomChangesToBooked(){
        conferenceRoom.setBooked(true);
        assertTrue(conferenceRoom.isBooked());
    }
}
