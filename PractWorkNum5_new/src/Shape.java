public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape() {

    }
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled=filled;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public boolean isFilled(){
        return filled;
    }
    public void setColor(boolean filled){
        this.filled = filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String toString();
}
class Circle extends Shape
{
    private double radius;

    public Circle(){
        radius = 1.0f;
        color = "RED";
        filled = false;
    }
    public Circle(double radius){
        this.radius = radius;
        color = "RED";
        filled = false;
    }
    public Circle(double radius, String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    @Override
    public String toString() {
        return "Rectangle: (radius:"+radius+", filled:"+filled+", color:"+color+")";
    }
}
class Rectangle extends Shape
{
    protected double width, length;
    public Rectangle(){
        width = 1;
        length = 1;
        color = "RED";
        filled = false;
    }
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
        color = "RED";
        filled = false;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }
    @Override
    public double getArea() {
        return width * length;
    }
    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }
    @Override
    public String toString() {
        return "Rectangle: (width:"+width+", length:"+length+", filled:"+filled+", color:"+color+")";
    }
}
class Square extends Rectangle
{
    public Square(){
        width = 1;
        length = 1;
        color = "RED";
        filled = false;
    }
    public Square(double side){
        width = side;
        length = side;
        color = "RED";
        filled = false;
    }
    public Square(double side, String color, boolean filled){
        width = side;
        length = side;
        this.color = color;
        this.filled = filled;
    }
    public double getSide(){
        return width;
    }
    public void setSide(double side){
        width = side;
        length = side;
    }
    public void setWidth(double side){
        width = side;
        length = side;
    }
    public void setLength(double side){
        width = side;
        length = side;
    }
    public String toString(){
        return "Square: (side:"+width+", filled:"+filled+", color:"+color+")";
    }
}