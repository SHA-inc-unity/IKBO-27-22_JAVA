public class Leg {
    private String side;
    private int lengthInCentimeters;

    public Leg(String side, int lengthInCentimeters) {
        this.side = side;
        this.lengthInCentimeters = lengthInCentimeters;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public int getLengthInCentimeters() {
        return lengthInCentimeters;
    }

    public void setLengthInCentimeters(int lengthInCentimeters) {
        this.lengthInCentimeters = lengthInCentimeters;
    }
}
