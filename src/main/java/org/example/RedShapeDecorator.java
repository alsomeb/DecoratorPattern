package org.example;

public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    // Overrides method in ShapeDecorator
    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape); // Mer funktionalitet, Red Shape har extra metod
    }

    private void setRedBorder(Shape decoratedShape) {
        System.out.println("Border color RED");
    }
}
