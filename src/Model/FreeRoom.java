package Model;

public class FreeRoom extends Room{
    public FreeRoom() {
        this.price = 0.00;
    }
    @Override
    public String toString() {
        return "Free Room  -- Room number: " + roomNumber + "Price: " + price + "Room Type: " + roomType;
    }
}
