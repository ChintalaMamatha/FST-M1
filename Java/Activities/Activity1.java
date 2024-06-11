package Activies;

public class Activity1 {
public static void main(String[] args) {
    Car fordecosport = new Car();
    fordecosport.color = "Brown";
    fordecosport.transmission = "Manual";
    fordecosport.make = 2021;
    fordecosport.tyres = 4;
    fordecosport.doors = 4;

    fordecosport.displayCharacteristics();
    fordecosport.accelarate();
    fordecosport.brake();   


}
}
 class Car{
    String color;
    String transmission;
    int make;
    int tyres;
    int doors;


public void displayCharacteristics(){
    System.out.println("color of car" + color);
    System.out.println("transmission of car" + transmission);
    System.out.println("make of car" + make);
    System.out.println("Number of tyres of car" + tyres);
    System.out.println("Number of dorrs of car" + doors);
    
}
public void accelarate(){
    System.out.println("Car is running");
}
public void brake(){
    System.out.println("Car stopped");
}
}


