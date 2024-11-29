package com.myprojects;
class Employee{
    int id;
    String name;
    Employee(int i, String n){
        id=i;
        name=n;
    }
    void displayinfo(){
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
    }
}
public class Constructor_L5P3 {
    public static void main(String[] args) {
            Employee obj1=new Employee(002, "Fahim Shahriar");
            Employee obj2=new Employee(006, "Mobin Zisan");
            obj1.displayinfo();
            obj2.displayinfo();
        }
    }