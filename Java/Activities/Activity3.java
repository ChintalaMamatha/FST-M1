package Activies;

public class Activity3 {
    public static void main(String[] args) {
        double seconds = 1000000000;
        double earthseconds = 31557600;
        double mecuryseconds = 0.2408467;
        double venusseconds = 0.61519726;
        double marsseconds = 1.8808158;
        double jupiterseconds = 11.862615;
        double saturnseconds = 29.447498;
        double uranusseconds = 84.016846;
        double neptuneseconds = 164.79132;

        System.out.println("Age of mercury" + seconds /  mecuryseconds );
        System.out.println("Age on Venus: " + seconds / earthseconds / venusseconds);
        System.out.println("Age on Earth: " + seconds / earthseconds);
        System.out.println("Age on Mars: " + seconds / earthseconds / marsseconds);
        System.out.println("Age on Jupiter: " + seconds / earthseconds / jupiterseconds);
        System.out.println("Age on Saturn: " + seconds / earthseconds / saturnseconds);
        System.out.println("Age on Uranus: " + seconds / earthseconds / uranusseconds);
        System.out.println("Age on Neptune: " + seconds / earthseconds / neptuneseconds);
    }

}
