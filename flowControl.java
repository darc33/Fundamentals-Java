/**
 *
 * @author Darc
 */

public class flowControl {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //IF-ELSEIF-ELSE STATEMENTS:
        if (1 < 4 && 0 > 5) { //&& Operador booleano and, operado de segundas  

            System.out.println("You ordered a cup of hot, mint tea.");

        } else if (21 <= 19 || 17 >= 28) { // || Operador booleano or, operado de terceras

            System.out.println("You ordered freshly squeezed orange juice!");

        } else if (!(true == true)) { // ! Operador booleano not, operado de primeras 

            System.out.println("You ordered hot cocoa!");

        } else {

            System.out.println("You ordered a cup of Java!");

        }
        
        //TERNARY CONDITIONAL (IF/ELSE IN A SINGLE LINE):
        
        int fuelLevel = 3;

	    char canDrive = (fuelLevel > 0) ? 'Y' : 'N'; //Ternary
        System.out.println(canDrive);

        //SWITCH STATEMENT:
        char answerChoice = 'C';

        switch (answerChoice) {

            case 'A':
                System.out.println("You answered: " + answerChoice + ". Please try again.");
                break;

            case 'B':
                System.out.println("You answered: " + answerChoice + ". Please try again.");
                break;

            case 'C':
                System.out.println("You answered: " + answerChoice + ". That is correct!");
                break;

            case 'D':
                System.out.println("You answered: " + answerChoice + ". Please try again.");
                break;

            default:
                System.out.println("Please select a valid answer choice.");

        }

    }
    
}
