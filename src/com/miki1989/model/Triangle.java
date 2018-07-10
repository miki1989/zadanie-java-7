package com.miki1989.model;

public class Triangle {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public boolean isRightTriangle(){
        if(Math.pow(side1,2) + Math.pow(side2,2) == Math.pow(side3,2) || Math.pow(side1,2) + Math.pow(side3,2) == Math.pow(side2,2) || Math.pow(side2,2) + Math.pow(side3,2) == Math.pow(side1,2)){
            return true;
        }
        else {
            return false;
        }
    }

    double getSide1(){
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    double getSide2(){
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    double getSide3(){
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public void getInfo(){
        System.out.println(side1 + " " + side2 + " " + side3);
    }
}
