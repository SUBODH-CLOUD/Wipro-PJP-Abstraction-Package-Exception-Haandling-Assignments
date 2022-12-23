import java.util.Random;

abstract class Compartment{
   abstract String notice();
   }

    class FirstClass extends Compartment{
    String notice(){
    return "FirstClass ticket sit in compartment ";
    }
    }
    class Ladies extends Compartment{
        String notice(){
            return " is reserved for Ladies";
        }
    }
    class General extends Compartment{
        String notice(){
            return "General ticket sit in  compartment ";
        }
    }
    class Luggage extends Compartment{
        String notice(){
            return "Keep the luggages in .";
        }
    }

    class TestCompartment{
        public static void main(String[] args) {
            Compartment[] compartments = new Compartment[10];
           Random random = new Random();
         
         for(int i=0; i<10; i++){

         
           int x = random.nextInt(4);
          switch(x){
            case 1:
            compartments[i] = new FirstClass();
            System.out.println(compartments[i].notice() + (i+1));
            break;
            case 2:
            compartments[i] = new  Ladies();
            System.out.println( (i+1) + compartments[i].notice());
            break;
            case 3:
            compartments[i] = new General();
            System.out.println(compartments[i].notice()+ (i+1));
            break;
            case 4:
            compartments[i] = new Luggage();
            System.out.println(compartments[i].notice()+(i+1));
            break;
          }
        }
        }
    }