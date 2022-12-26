package test;
import test.*;

class AnotherClass extends test.Foundation{
    AnotherClass(){
  // System.out.println("Private variable var1 = " + var1);
   System.out.println("Default variable var2 = " + var2);
   System.out.println("Protcected variable var3 = " + var3);
   System.out.println("Public variable var4 = " + var4); 
}
   public static void main(String[] args) {
     AnotherClass a = new AnotherClass();
  }
 }
