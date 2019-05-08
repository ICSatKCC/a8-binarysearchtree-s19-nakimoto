/**
 * Pokemon Exception.
 * @author Nanami Kimoto
 * @since 3/25/19
 */
 
public class PokemonException extends RuntimeException {
   
   /** Variable declaration. */
   private String message = "";
   
   /**
    * Get method for the returned message.
    * @return String message for thrown exception.
    */
   public String getMessage() {
      return this.message;
      
   }
   
   /**
    * Set method for returned message.
    * @param mainMessage The main message..
    */
   public void setMessage(String mainMessage) {
      this.message = mainMessage;
      
   } //close method
   
} //close class