package org.example;

public abstract class ShapeDecorator implements Shape {

    protected Shape decoratedShape;


    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    // Impl metod i "Shape" interface
    public void draw(){
        decoratedShape.draw();
    }

}
