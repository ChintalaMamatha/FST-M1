package Activies;

public class Activity2 {
       
    public static void main(String[] args) {
        
        int[] numArr = {10, 77, 10, 54, -11, 10};
        int add = 0;
        for(int i=0; i<numArr.length; i++)
        {
            if (numArr[i]==10) {
                add = add + numArr[i];
                
            }
        }
if ((add==30)) {
    System.out.println("True");
}
    else
    {
        System.out.println("False");
    }

    
}
}