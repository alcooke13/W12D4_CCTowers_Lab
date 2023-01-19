package ccTowers;



import guests.Guest;

import java.util.ArrayList;

import static ccTowers.RoomType.SINGLE;

public class Hotel {

    private ArrayList<Bedroom> bedroomList;
    private ArrayList<ConferenceRoom> conferenceRoomList;
    private String name;

    private ArrayList<Guest>guestsToCheckIn;

    public Hotel(String name ){
        this.bedroomList = new ArrayList<Bedroom>();

        Bedroom singleBedroom = new Bedroom(RoomType.SINGLE, 12);
        bedroomList.add(singleBedroom);
        Bedroom doubleBedroom = new Bedroom(RoomType.DOUBLE, 10);
        bedroomList.add(doubleBedroom);

        this.conferenceRoomList= new ArrayList<ConferenceRoom>();

        ConferenceRoom conferenceRoom1 = new ConferenceRoom(RoomType.CONFERENCEROOM, "The Magenta Suite", true);
        conferenceRoomList.add(conferenceRoom1);

        this.name = name;
        this.guestsToCheckIn= new ArrayList<Guest>();
    }

    public ArrayList<Bedroom> getBedroomList() {
        return this.bedroomList;
    }

    public ArrayList<ConferenceRoom> getConferenceRoomList() {
        return this.conferenceRoomList;
    }

    public String getName() {
        return this.name;
    }

    public void addBedroom(Bedroom bedroom){
        this.bedroomList.add(bedroom);
    }
    public void addConferenceRoom(ConferenceRoom conferenceRoom){
        this.conferenceRoomList.add(conferenceRoom);
    }
    public int countBedrooms(){
        return this.bedroomList.size();
    }
    public int countConferenceRooms(){
        return this.conferenceRoomList.size();
    }

    public void checkGuestsIn(ArrayList<Guest>guestsToCheckIn){
        if (guestsToCheckIn.size()<= getEnumRoomCapacity() && );

        //if array size >= room capacity && room booked= false
        //then for guest in guests add to room

    }


}
