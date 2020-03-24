package com.circle;

class Circle {
    static final double pi=Math.PI;
    private double radius=1.0;
    private String color="red";

    Circle(){

    }

    Circle(double newRadius){
        this.radius=newRadius;
    }

    public double getRadius(){
        return this.radius;
    }

    public double getArea(){
        return (this.radius*this.radius*pi);
    }
}
