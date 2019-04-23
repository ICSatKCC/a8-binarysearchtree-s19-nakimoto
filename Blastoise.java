/**
* Blastoise Pokemon object class.
* Subclass of Wartortle
* @author Nanami Kimoto
* @since 2/15/19
*/
public class Blastoise extends Wartortle {

   /** The minimum attack power for species. */ 
   static final int BASE_ATTACK_POWER = 171;
   /** The minimum defense power for species. */
   static final int BASE_DEFENSE_POWER = 210;
   /** The minimum stamina power for species. */
   static final int BASE_STAMINA_POWER = 150;
   
   /** Constructor with no name. */
   public Blastoise() {
      super("Blastoise", "Blastoise", 9, 1.6, 85.5, BASE_ATTACK_POWER, 
          BASE_DEFENSE_POWER, BASE_STAMINA_POWER);   
   }
   /** Constructor with name.
   * @param name The user-defined name.
   */
   public Blastoise(String name) {
         super("Blastoise", name, 9, 1.6, 85.5, BASE_ATTACK_POWER, 
            BASE_DEFENSE_POWER, BASE_STAMINA_POWER);
   }
}
   