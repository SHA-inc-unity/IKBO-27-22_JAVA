/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Artem
 */

public class Ball {
    private String color;
    private double size;

    public Ball(String color, double size) {
        this.color = color;
        this.size = size;
    }

    public void setSize(double size){
        this.size = size;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public double getSize(){
        return size;
    }

    public void getBallInfo()
    {
        System.out.println("color "+this.color+", size"+this.size);
    }
}