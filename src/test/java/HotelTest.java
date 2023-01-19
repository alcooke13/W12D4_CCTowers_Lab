import ccTowers.Bedroom;
import ccTowers.ConferenceRoom;
import ccTowers.Hotel;
import guests.Guest;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private Bedroom singleBedroom;
    private Bedroom doubleBedroom;
    private ConferenceRoom conferenceRoom1;
    private ConferenceRoom conferenceRoom2;
    private Guest guest1;
    private Guest guest2;
    private Guest guest3;



    @Before
    public void before(){
        hotel = new Hotel("Happy Land");

    }

    @Test
    public void getBedroomCount(){
        assertEquals(2, hotel.countBedrooms());
    }

    @Test
    public void getConferenceRoomCount(){
        assertEquals(1, hotel.countConferenceRooms());
    }
}
