package com.myprojects;

class Area{
        double length;
        double breadth;

        Area(double l, double b){
            length=l;
            breadth=b;
        }
        double returnArea(){
            double area =length*breadth;
            return area;

        }
    }
    public class Area_L5P4 {
        public static void main(String[] args) {
            Area a1=new Area(15,10);
            double result=a1.returnArea();
            System.out.println("Area of the Rectangle: "+result);
        }
    }
