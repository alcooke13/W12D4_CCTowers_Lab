package ccTowers;
import guests.Guest;
import java.util.ArrayList;

public abstract class Room {
    private RoomType roomType;
    private ArrayList<Guest> guestList;
    private boolean isBooked;

    public Room(RoomType roomType) {
        this.roomType = roomType;
        this.guestList = new ArrayList<Guest>();
        this.isBooked = false;
    }

    public RoomType getRoomType() {
        return this.roomType;
    }

    public int getEnumRoomCapacity(){
        return this.roomType.getRoomCapacity();
    }

    public ArrayList<Guest> getGuestList() {
        return this.guestList;
    }

    public int guestCount(){
        return this.guestList.size();
    }

    public boolean isBooked() {
        return this.isBooked;
    }

    public void setBooked(boolean booked) {
        this.isBooked = booked;
    }

    public void addGuest(Guest guest){
        if(this.getEnumRoomCapacity() > this.guestList.size()){
            this.guestList.add(guest);
        }
    }
}
