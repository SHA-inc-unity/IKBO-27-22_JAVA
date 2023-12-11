
public class Hand {
    private String side;
    private int fingersCount;

    public Hand(String side, int fingersCount) {
        this.side = side;
        this.fingersCount = fingersCount;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public int getFingersCount() {
        return fingersCount;
    }

    public void setFingersCount(int fingersCount) {
        this.fingersCount = fingersCount;
    }
}
