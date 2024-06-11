package Activies;

public class Car {
    
        String color = "Brown";
        String transmission = "Manual";
        int make = 2021;
        int tyres = 4;
        int doors = 4;
    
    
    public void displayCharacteristics(){
        System.out.println("color of  car " + color);
        System.out.println("transmission of car " + transmission);
        System.out.println("make of car " + make);
        System.out.println("Number of tyres of car " + tyres);
        System.out.println("Number of dorrs of car " + doors);
        
    }
    public void accelarate(){
        System.out.println("Car is running");
    }
    public void brake(){
        System.out.println("Car stopped");
    }
    }
    
    
    


