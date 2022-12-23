class MyException extends Exception {
    public  MyException(){
        System.out.println("User defined Exception thrown");
    }
    public String toString(){
        return "MyException Object : Age cannot be less than 18 and greater than equal to 60";
    }
}

    class NameAge {
    static int flag = 0;
    public static void main(String[] args)  {
        try{
            String name = args[0];
            int age = Integer.parseInt(args[1]);
            if(age<18 || age >= 60){
                throw new MyException();
            }
            
           
        }catch(ArrayIndexOutOfBoundsException e){
            flag = 1;
            System.out.println("Exception : " + e);
        }catch(NumberFormatException e){
            flag = 1;
            System.out.println("Exception : " + e);
        }catch(MyException e){
            flag = 1;
            System.out.println("Exception Within catch: " + e);
        }
        if(flag == 0){
            System.out.println("Everything is fine");
        }
        
    }
}
