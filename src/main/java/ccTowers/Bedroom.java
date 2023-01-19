package ccTowers;

import guests.Guest;
import sun.security.util.ArrayUtil;

import java.util.ArrayList;

public class Bedroom extends Room {

    private int roomNumber;
    private RoomType roomType;

    public Bedroom(RoomType roomType, int roomNumber) {
        super(roomType);
        this.roomNumber = roomNumber;
    }

    public int getRoomNumber() {
        return this.roomNumber;
    }
}
