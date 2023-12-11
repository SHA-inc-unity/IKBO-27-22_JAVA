public class MovableRectangle implements Movable{
    MovablePoint topLeft, bottomRight;

    public MovableRectangle(int x1, int y1, int xSpeed1, int ySpeed1, int x2, int y2, int xSpeed2, int ySpeed2){
        topLeft = new MovablePoint(x1, y1, xSpeed1, ySpeed1);
        bottomRight = new MovablePoint(x2, y2, xSpeed2, ySpeed2);
        checkSameness();
    }

    @Override
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    public void checkSameness(){
        if (topLeft.xSpeed != bottomRight.xSpeed)
            topLeft.xSpeed = bottomRight.xSpeed;
        if (topLeft.ySpeed != bottomRight.ySpeed)
            topLeft.ySpeed = bottomRight.ySpeed;
    }
}
