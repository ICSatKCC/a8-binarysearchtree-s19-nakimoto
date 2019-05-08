import java.util.*;
import java.util.Random;
/**
* Pokedex.
* @author Nanami Kimoto
* @since 4/20/19
*/
public class Pokedex {

   /**Scanner for input.*/
   private static Scanner userIn = new Scanner(System.in);
   /**String for input.*/
   private static String inString = new String("");
   /**Random.*/
   private static Random randGen = new Random();
   /**For menu design.*/
   private static String b = "*************";
   /**PokeTree.*/
   private static PokeTree<Pokemon> tree = new PokeTree<Pokemon>();
   /**Object declaration constant.*/
   private static Pokemon p;
   /**Private int declaration.*/
   private static int Count = 0;
   
   /** Main Method.
   *@param args not used.
   */
   
   public static void main(String[] args) { 
   //menu.
   //endloop for menu use. 
      boolean endLoop = false;
      while (!endLoop) {
         
         System.out.println("This is your Pokedex.");
         System.out.println("1. Add Pokemon");
         System.out.println("2. Trade Pokemon");
         System.out.println("3. Print Pokedex");
         System.out.println("0. Exit the program");
         System.out.println("What would you like to do?");
         
         
         inString = userIn.nextLine().trim();
         System.out.println(b); 
         //switch for menu options.      
         switch(inString) {
         
         //exit condition.
            case "0": endLoop = true; 
               System.out.println("Good bye!");
               break;
               
            case "1": 
            //adds pokemon.
               System.out.println("Catch Pokemon"); 
               p = ChoosePokemon.choosePokemon();
               tree.add(p);
               Count++;
               break;
               
            case "2": 
            //removes pokemon.
               p = ChoosePokemon.choosePokemon();
               tree.remove(p);
               Count--;
               break;
               
            case "3": 
                //prints caught pokemon.
               System.out.println("Pokemon caught: " + Count + "\n");
               tree.printPokeTree();
               System.out.println("\n" + b);
               break;
               
            default: 
            //invalid entry.
               System.out.println("\n Invalid entry!");
               System.out.println("Please enter a 0, 1, 2 or 3 ");
               break;
               
         }    
      }  


   }  //close main

} //close class