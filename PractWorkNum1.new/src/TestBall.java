
public class TestBall {
    public static void main(String[] args) {
        Ball d1 = new Ball("green", 2);
        Ball d2 = new Ball("white", 7);
        Ball d3 = new Ball("blue", 17); d3.setSize(1);
        System.out.println(d1);
        d1.getBallInfo();
        d2.getBallInfo();
        d3.getBallInfo();
    }
}