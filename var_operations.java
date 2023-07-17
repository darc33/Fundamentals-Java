package Bases;

/**
 *
 * @author Darc
 */
public class var_operations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //HI WORLD
        System.out.println("Hola Mundo"); 
        
        //VARIABLE TYPES
        int myNumber = 42; //Variable tipo entero
	    boolean isFun = true; //Variable tipo booleana
	    char movieRating = 'A'; //Variable tipo caracter
        
        //MATH
        int sum = 34 + 113; //suma
        int difference = 91 - 205; // resta
        int product = 2 * 8; // multiplicacion
        int quotient = 45 / 3; //division
        int myRemainder = 16 % 7; //modulo
		
        System.out.println(sum); 
        System.out.println(difference); 
        System.out.println(product); 
        System.out.println(quotient); 
        System.out.println(myRemainder);
        
        //RELATIONAL OPERATORS
        
        System.out.println( 6 < 10); // < : menor, <= : menor o igual, > : mayor, >= : mayor o igual
        
        //EQUALITY OPERATORS
        
        System.out.println(false == true); // == : igual, != : no igual
        
    }
    
}
