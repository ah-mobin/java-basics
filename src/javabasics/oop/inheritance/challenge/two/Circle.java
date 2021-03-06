package javabasics.oop.inheritance.challenge.two;

public class Circle {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
        if(this.radius < 0)
            this.radius = 0;
    }

    public double getRadius(){
        return this.radius;
    }

    public double getArea(){
        return this.radius * this.radius * Math.PI;
    }
}
