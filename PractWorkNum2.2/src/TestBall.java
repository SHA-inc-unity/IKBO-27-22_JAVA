




public class TestBall {

    public static void main(String[] args) {
        Ball ball = new Ball();

        System.out.println(ball.getX());
        System.out.println(ball.getY());

        ball.setXY(2, 7);

        System.out.println(ball.getX());
        System.out.println(ball.getY());

        ball.move(-1, 2);

        System.out.println(ball.getX());
        System.out.println(ball.getY());

        System.out.println(ball);
    }
}