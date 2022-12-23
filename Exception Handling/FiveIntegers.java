class FiveIntegers {
    public static void main(String[] args) {
       try{
        int[] arr = new int[5];
        arr[0] = Integer.parseInt(args[0]);
        arr[1] = Integer.parseInt(args[1]);
        arr[2] = Integer.parseInt(args[2]);
        arr[3] = Integer.parseInt(args[3]);
        arr[4] = Integer.parseInt(args[4]);
        int sum = 0;
        for(int i =0; i<args.length; i++){
            sum = sum + arr[i];
        }
        int average = sum/args.length;
        System.out.println("Sum is = " + sum);
        System.out.println("Average is = " + average);
       }catch(ArithmeticException e){
            System.out.println(e);
       }catch(NumberFormatException e){
        System.out.println(e);
       }catch(ArrayIndexOutOfBoundsException e){
        System.out.println(e);
       }
       System.out.println("After try/catch block.");
    }
}
