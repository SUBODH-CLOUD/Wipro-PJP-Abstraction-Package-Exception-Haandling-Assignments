import java.util.InputMismatchException;
import java.util.Scanner;



class UsrEx extends Exception{
    public String toString(){
        return "Marks should be between 1 and 100";
    }
} 

class Student{
    
  static void student(){
    double sum = 0;
    double average= 0;
    try{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student name : ");
        String name = sc.nextLine();
        System.out.println("Enter "+ name + " Marks ");
        double[] M = new double[3];
        for(int i=0; i<3; i++){
              M[i]= sc.nextInt();
              if(M[i]>100 || M[i]<1){
                throw new UsrEx();
            }
        }
        for(int i =0; i<3; i++){
            sum = sum + M[i];
        }
       
        average = sum/3;
        System.out.println(name + " details are ");
        System.out.println("Sum is " + sum);
        System.out.println("Average is " + average);
        }catch(UsrEx ex){
        System.out.println("Within catch..." + ex);
        }catch(NumberFormatException e){
        System.out.println(e);
        }catch(InputMismatchException e){
        System.out.println("Please enter number only: " + e);
        }catch(ArrayStoreException e){
        System.out.println(e);
    }
  }
     
  public static void main(String[] args) {
    student();
    student(); 
 }
}