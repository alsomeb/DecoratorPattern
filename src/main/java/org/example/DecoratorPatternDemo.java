package org.example;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();

        // Red circle
        // Samma som buffered reader tar in fileReader osv...
        Shape redCircle = new RedShapeDecorator(new Circle());

        // Ger ett meddelande
        circle.draw();

        System.out.println();

        // ger circle medd + border color red
        redCircle.draw();
    }
}
