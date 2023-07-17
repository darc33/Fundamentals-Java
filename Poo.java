/**
 *
 * @author Darc
 */
public class Poo extends segunda_clase{

    /**
     * @param args the command line arguments
     */
    int age; //instance variable, variable asociada a los objetos de la clase
    public Poo(int Anyage){//Constructor de la clase, permite agregar informacion de la clase
        age = Anyage;  
    } 
    
    public void method(){ // Metodo: pre-defined set of instructions
        System.out.println("Method!");
    }
    
    public void another(int some){ // Metodo con parametros
        System.out.println("This method do " + some + " operations!");
    }
    
    public int getAge() { //Metodo que devuelve un valor
        return age;
    }
    
    public static void main(String[] args) {
        Poo nn = new Poo(10); //Crea un objeto de la clase usando el constructor
        nn.method();
        nn.another(3);
        int nnAge = nn.getAge();
        System.out.println(nnAge);
        nn.checkStatus();
    }
    
}
