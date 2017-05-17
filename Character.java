/*
 * Character Class for Mass Effect Demo 
 */
 
 import java.io.BufferedReader; 
 
 public class Character {
  public static void main (String args[]) throws
  java.io.IOException {
    
    class Create Character {
      //Initialize all the variables
      String name, confirm, gender, race, tech, attr, attr_str; 
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      boolean confirm_name = false;
      String genders[] = {"Male","Female"};
      String races[] = {"Human","Asari","Krogan","Salarian"};
      String techs[] = {"Warrior","Engineer","Infiltrator","Adept","Technician"};
      String weapons[] = {"Assault Rifle","Shotgun","Sniper Rifle","Pistol","SMG","Omnitool"};
      String weapon_specs = new String[3];
      int att_int;
      
      // Select Protagonist's Name
      String select_name() {
        do {
          System.out.println("What do you want to name your character?");
          try {
            name = br.readLine();
            System.out.println("Are you sure? (Y/N)"); 
            confirm = br.readLine(); 
            if(confirm.matches(".*(Y|y|yes|YES|Yes|yES|yeS).*")) confirm_name = true; 
          } catch(Exception e) {
            System.out.println("Answer the question properly");
          }
        } while(!confirm_name); 
        return name; 
      }
    }
      
    // Create the Character
    Create_Character protagonist = new Create_Character(); 
    protagonist.name = protagonist.select_name(); 
    System.out.println("Protagonist: "+protagonist.name); 
      
  }
}
