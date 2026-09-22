//package org.example.design.principles;
//
///*
//SubType must be Substitutable for their base type
// * */
//
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//
//class RectangleLSP {
//
//    private double width;
//    private double height;
//
//    public double getWidth() {
//        return width;
//    }
//
//    public void setWidth(double width) {
//        this.width = width;
//    }
//
//    public double getHeight() {
//        return height;
//    }
//
//    public void setHeight(double height) {
//        this.height = height;
//    }
//}
//
///// If you  extends Rectangle class then
//class AreaLSP {
//    private double width; //set both height and width  to w
//    private double height; // set both height and width to h
//
//    public double getWidth() {
//        return width;
//    }
//
//    public void setWidth(double width) {
//        this.width = width;
//    }
//
//    public double getHeight() {
//        return height;
//    }
//
//    public void setHeight(double height) {
//        this.height = height;
//    }
//}
//
//public class LiskovSubstitutionPrinciple {
//    @Test
//    public void getArea() {
//        AreaLSP a = new AreaLSP();
//        a.setHeight(5);
//        a.setWidth(6);
//        Assertions.assertEquals(5 * 6, a.getHeight() * a.getWidth());
//    }
//
//}
//
