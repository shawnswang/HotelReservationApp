package Model;

public class Room implements IRoom{
    public String roomNumber;
    public Double price;
    public RoomType roomType;

    @Override
    public String toString() {
        return "Room  -- Room number: " + roomNumber + "Price: " + price + "Room Type: " + roomType;
    }

    @Override
    public String getRoomNumber() {
        return roomNumber;
    }

    @Override
    public Double getRoomPrice() {
        return price;
    }

    @Override
    public RoomType getRoomType() {
        return roomType;
    }

    @Override
    public boolean isFree() {
        return false;
    }
}
