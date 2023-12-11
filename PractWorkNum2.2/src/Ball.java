public class Ball {
    private double x = 0.0f, y = 0.0f;

    public Ball(double x, double y){
        this.x = x;
        this.y = y;
    }

    public  Ball(){

    }

    public  double getX(){
        return x;
    }

    public void setX(double x){
        this.x = x;
    }

    public double getY(){
        return  y;
    }

    public void setY(){
        this.y = y;
    }

    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void move(double xDisp, double yDisp){
        x += xDisp;
        y += yDisp;
    }

    public String toString(){
        return "Ball @("+x+","+y+")";
    }
}
