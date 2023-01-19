package ccTowers;

public enum RoomType {
    SINGLE(1),
    DOUBLE(2),
    FAMILY(4),
    CONFERENCEROOM(2);

    private final int roomCapacity;

    RoomType(int roomCapacity) {
        this.roomCapacity = roomCapacity;
    }

    public int getRoomCapacity() {
        return this.roomCapacity;
    }
}
