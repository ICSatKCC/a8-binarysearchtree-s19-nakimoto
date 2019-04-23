/**
 * PokeDex Driver. 
 * 
 * @author Nanami Kimoto
 */
 //driver base code.
   public class Pokedex {   
   
   /**
    * Driver code to test class
    * 
    * @param commandlineArguments
    *            are not used
    */
      public static void main(String[] commandlineArguments) {
      //Use PokeNode<String>.
         BinarySearchTree<String> tree = new BinarySearchTree<String>();
         System.out.println("TEST add() method:");
         tree.add("mahimahi");
         tree.add("hee");
         tree.add("ono");
         tree.add("mano");
         tree.add("lauwiliwili");
         tree.add("honu");
         tree.add("ulua");
         tree.add("uhu");
         tree.add("ahi");
         System.out.println("preorder:\n" + tree.preOrder());
         System.out.println("inorder:\n" + tree.toString());
         System.out.println("postorder:\n" + tree.postOrder());
      
      //testing get method.
         System.out.println("TEST get() method:");
         String fish = tree.get("mahimahi");
         System.out.println(fish);
         fish = tree.get("ono");
         System.out.println(fish);
         try {
            fish = tree.get("tuna");
            System.out.println(fish);
         } 
            catch (TreeException exception) {
               System.out.println(exception.toString());
            }
         fish = tree.get("uhu");
         System.out.println(fish);
      
      //Testing remove method. 
         System.out.println("\nTEST remove() method:");
         System.out.println("inorder:\n" + tree.toString());
         tree.remove("mahimahi");
         System.out.println("inorder:\n" + tree.toString());
         tree.remove("ulua");
         System.out.println("inorder:\n" + tree.toString());
         tree.remove("ono");
         System.out.println("inorder:\n" + tree.toString());
         tree.remove("ahi");
         System.out.println("inorder:\n" + tree.toString());
      }// end of main
   }// end of class