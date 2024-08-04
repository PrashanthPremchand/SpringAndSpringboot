public class Main {
    public static void main(String[] args) {
        //Exception handling
//        int i = 10;
//        int j = 0;
//        int k = i / j;
//        try{
//            int k = i / j;//Critical statement
//        }
//        catch (ArithmeticException e){
//            System.out.println("Hey! you have encountered an arithmetic exception.");
//        }
//        catch (Exception e){
//            System.out.println("Hey! you have encountered an exception.");
//        }
//        finally{
//            //No matter the exception this block will be executed
//            System.out.println("You are inside the finally block");
//        }

        //throw keyword
//        try{
//            ageVerification(15);
//            System.out.println("Welcome");
//        }
//        catch (ArithmeticException e){
//            System.out.println(e.getMessage());
//        }

        //throws keyword
//        try{
//            divide(5, 1);
//        }
//        catch (ArithmeticException e){
//            System.out.println("Hey! you have divided by zero.");
//        }

        //custom Exception
        try{
            ageVerification(27);
            System.out.println("Welecome!");
        }
        catch (AgeException e){
            System.out.println(e.getMessage());
        }
    }

    //throw keyword
//    public static void ageVerification(int age){
//        if(age < 18){
//            throw new ArithmeticException("Your are not old enough");
//        }
//    }

    //throws keyword
//    public static void divide (int i, int j) throws ArithmeticException{
//        int k = i / j;
//        System.out.println(k);
//    }

    //custom exception
    public static void ageVerification(int age){
        if(age < 18){
            throw new AgeException("Your too young!");
        }
    }
    public static class AgeException extends RuntimeException{
        public AgeException(String message){
            super(message);
        }
    }
}