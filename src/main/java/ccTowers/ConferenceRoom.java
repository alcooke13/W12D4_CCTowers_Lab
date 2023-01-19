package ccTowers;
import guests.Guest;

import java.util.ArrayList;

public class ConferenceRoom extends Room{
    private String name;
    private boolean snacksProvided;

    public ConferenceRoom(RoomType roomType, String name, boolean snacksProvided) {
        super(roomType);
        this.name = name;
        this.snacksProvided = snacksProvided;
    }

    public String getName() {
        return this.name;
    }

    public boolean isSnacksProvided() {
        return this.snacksProvided;
    }
}
