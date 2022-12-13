package org.example;

// Hjälp Klass
public abstract class ShapeDecorator implements Shape {
    // Referens till figur
    protected Shape decoratedShape;

    // Lägger ref till figur i constructor
    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    // Impl metod i "Shape" interface, hjälp metod, jobbet görs i RedShapeDecorator
    public void draw(){
        decoratedShape.draw();
    }

}
