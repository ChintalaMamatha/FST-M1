package Activies;

import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args) {
    ArrayList<String> myList = new ArrayList<String>();
    myList.add("Vikram");
    myList.add("Hasini");
    myList.add("Vivan");
    myList.add("Bujii");
    myList.add("oye");

for(String name : myList){
    System.out.println(name);

}

String thridname = myList.get(2);
System.out.println("Thrid name in Array is" +  thridname);

String nameToCheck = "Bujii";
if (myList.contains(nameToCheck)){
    System.out.println((" name to check in Array List is" + nameToCheck));
}
else{
    System.out.println((" name to check in Array List does not present is" + nameToCheck));
}

System.out.println("Number of names in ArrayList is" + myList.size());
    }


}








