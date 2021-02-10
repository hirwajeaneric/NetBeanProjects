package exception_handling;
/**
 * Bellow is a simplified sample of how exceptions are handled in java.
 * public class ExcpetoinHandling {
    public static void main(String args[]){
        try{
    //Code that my raise exception
        }
    catch(Exception e){
    //Rest of the program
        }
    }
}
 */

//BELLOW ARE EXAMPLES OF BUILD IN EXCEPTIONS WHICH ARE IN JAVA LIBRARIES.

public class ExceptionHandling {
/*
    public static void main(String args[]){
*/
/**Example 1: Normally is is not possible to find the size of 
 * an empty string. It actually automatically gives an error when 
 * you try to run such a program.*/
/*
        try {
        String str = null;
        System.out.println(str.length());
        }
        catch(Exception e) {
            System.out.println("Can't find the size of an empty string!");
        }
        //Another one:
        try {
            int a=30, b=0;
            int c = a/b;
            System.out.println("result ="+c);
        }
        catch(ArithmeticException e){
            System.out.println("Can't divide a number by zero");
        }
        //Another one:
        try {
            int num = Integer.parseInt("Hirwa");
            System.out.println(num);
        }
        catch(NumberFormatException e){
            System.err.println("This is a number format exception");
        }
        //Another one:
        try {
            int array[] = new int[5];
            array[7]=9;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("This is an array out of bound exception because we have tried to access an element of an array which is out of the bundaries of our array.");
        }
        
    }
}
*/
 
/**OTHER EXCEPTION HANDLING METHODS ONE NEEDS TO KNOW ARE:
 * finally, throw, and throws
 * 
 * Let's first start with FINALLY:
 * 
 * FINALLY METHOD IS ACTUALLY USED REGUARDLESS THE FACT THAT WE DO NOT
 * HAVE A CATCH METHOD.
 * In that case, the error will be displayed and finally display a
 * out defined message.
 * 
 * Bellow is an example:
 * */

public static void main(String args[]){
    try {
            int a=30, b=0;
            int c = a/b;
            System.out.println("result ="+c);
        }
    finally {
        System.out.println("This is how finaly is used.");   
        }
    }
}
