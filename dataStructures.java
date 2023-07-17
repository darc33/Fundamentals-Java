import java.util.*;

/**
 *
 * @author Darc
 */
public class dataStructures {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //FOR LOOP:
        for (int waterLevel = 0; waterLevel < 7; waterLevel++) {

            System.out.println("The pool's water level is at " + waterLevel + " feet.");

        }
        
        //ARRAYLIST
        
        ArrayList<Integer> weeklyTemperatures = new ArrayList<Integer>(); //crear un arraylist

        weeklyTemperatures.add(78); //Añadir valores al arraylist
        weeklyTemperatures.add(67);
        weeklyTemperatures.add(89);
        weeklyTemperatures.add(94);
        
        System.out.println( weeklyTemperatures.get(1)); // Accesar a un valor del arraylist
        
        weeklyTemperatures.add(2, 111); //insertar un valor en una posicion especifica del arraylist
        System.out.println( weeklyTemperatures.get(3));
        
        for (int j = 0; j < weeklyTemperatures.size(); j++) { //Iterating over arrayList
            System.out.println(weeklyTemperatures.get(j));
        }
        
        //FOR EACH LOOP
        
        for (Integer temperature : weeklyTemperatures) {
            System.out.println(temperature);
        }
        
        //HASHMAP
        
        HashMap<String, Integer> restaurantMenu = new HashMap<String, Integer>(); //crear un HashMap

        restaurantMenu.put("Turkey Burger", 13); //Añadir valores al HashMap
        restaurantMenu.put("Naan Pizza", 11);
        restaurantMenu.put("Cranberry Kale Salad", 10);
        
        System.out.println( restaurantMenu.get("Naan Pizza") ); //Accesar a un valor del HashMap
        
        System.out.println(restaurantMenu.size()); //.size() permite conocer el tamaño del HashMap

        for (String item : restaurantMenu.keySet()) { //.keySet() devuelve una lista de keys

            System.out.println("A " + item + " costs " + restaurantMenu.get(item) + " dollars.");
        }
        
        //PROYECT OLYMPIC SPORTS      
        ArrayList<String> olympicSports = new ArrayList<String>();
        olympicSports.add("Archery");
        olympicSports.add("Boxing");
        olympicSports.add("Cricket");
        olympicSports.add("Diving");

        System.out.println("There are " + olympicSports.size() + " Olympic sports in this list. They are: ");

        for (String sport : olympicSports) {
            System.out.println(sport);
        }
        //Host cities and the year they hosted the summer Olympics
        HashMap<String, Integer> hostCities = new HashMap<String, Integer>();

        hostCities.put("Beijing", 2008);
        hostCities.put("London", 2012);
        hostCities.put("Rio de Janeiro", 2016);

        for (String city : hostCities.keySet()) {

            if (hostCities.get(city) < 2016) {

                System.out.println(city + " hosted the summer Olympics in " + hostCities.get(city) + ".");

            } else {

                System.out.println(city + " will host the summer Olympics in " + hostCities.get(city) + ".");

            }
        }
    }
    
}
