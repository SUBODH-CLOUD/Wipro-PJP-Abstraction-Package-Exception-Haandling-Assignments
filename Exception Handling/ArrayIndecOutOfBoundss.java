
import java.util.*;

class ArrayIndecOutOfBoundss{
    public static void main(String[] args) {
       try{
         try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of elemets in the array ");
            int NoOfElement =  sc.nextInt();
            System.out.println("Enter the elemets of the array ");
            int[] arr = new int[NoOfElement];
            for(int i=0; i< NoOfElement; i++){
                arr[i] = sc.nextInt();
            } 
            System.out.println("Enter the index of the array element you want to access");
            int  index = sc.nextInt();
            System.out.println("The array element at index " + index + " = " + arr[index]);
        }
        
        }catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e); 
        }catch(InputMismatchException e)
        {
            System.out.println("java.lang.NumberFormatException");
        }
        System.out.println("The array element successfully accessed");
       
    }
}