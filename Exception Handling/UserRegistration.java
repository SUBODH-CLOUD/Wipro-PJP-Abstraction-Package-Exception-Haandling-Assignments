class InvalidCountryException extends Exception{
    private String s;
    InvalidCountryException(String outside){
         s = outside;
    }
    public String toString(){
      System.out.println();
        return s;
    }
}

class UserRegistration {
    
        static void registerUser(String username, String userCountry){
           try{
            if(userCountry != "India"){
                throw new InvalidCountryException("User Outside India can not be registered");
            }else if(userCountry == "India"){
                System.out.println("User registration done successfully");
            }
           }catch(InvalidCountryException e){
            System.out.println(e);
           }
        }
        public static void main(String[] args) {
            registerUser("Micky", "US");
            registerUser("Mini", "India");
        }
    }

