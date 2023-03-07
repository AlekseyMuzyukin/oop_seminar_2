package Forma;

import Forma.forma.Rectangle;
import Forma.forma.Shape;
import Forma.forma.Square;

public class Task_06 {
    public static void main(String[] args) {
        Square newSquare = new Square();
        newSquare.setSide(5);
        System.out.println(newSquare.area());
        System.out.println(newSquare.perimeter());
        newSquare.setSide(0.0);
        newSquare.setDiagonal(10.0);
        System.out.println(newSquare.area());
        System.out.println(newSquare.perimeter());
        Shape newRectangle = new Rectangle(5.0, 4.0);
        System.out.println(newRectangle.area());
        System.out.println(newRectangle.perimeter());
    }
}