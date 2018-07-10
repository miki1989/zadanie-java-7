package com.miki1989.app;

import com.miki1989.model.Triangle;
//import com.miki1989.model.TriangleCreator;

public class TriangleTest {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(2,3,4);
        //Triangle triangle2 = new Triangle(3,4,5);

        //TriangleCreator creator = new TriangleCreator();
        System.out.println("Trójąkt o wymiarach:");
        triangle1.getInfo();
        System.out.print("Ma wartość: ");
        System.out.println(triangle1.isRightTriangle());

        triangle1.setSide1(3);
        triangle1.setSide2(4);
        triangle1.setSide3(5);
        System.out.println("Trójkąt o wymiarach:");
        triangle1.getInfo();
        System.out.print("Ma wartość: ");
        System.out.println(triangle1.isRightTriangle());
    }
}
