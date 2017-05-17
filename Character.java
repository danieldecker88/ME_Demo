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
     
     //Choose Attributes
     String choose_attribute(String subject, String lists[]) {
      do {
       try {
        System.out.println("What is your "+subject+"? "); 
        for (int i; i < lists.length; i++) {
         System.out.println((i+1)+": "+lists[i]);
        }
        Scanner s = new Scanner(System.in); 
        attr_str = s.nextLine();
       } catch (Exception e) {
        System.out.println("Answer out of range"); 
       }
       System.out.println("\n"); 
       
       att_int = Integer.parseInt(attr_str) -1; 
       attr = lists[att_int]; 
      } while (attr.length() < 1); 
      return attr; 
     }
     
     // Weapon Specialization
  }
      
    // Create the Character
    Create_Character protagonist = new Create_Character(); 
    protagonist.name = protagonist.select_name(); 
    protagonist.gender = protagonist.choose_attribute("Gender", protagonist.genders); 
    protagonist.race = protagonist.choose_attribute("Race", protagonist.races); 
    protagonist.tech = protagonist.choose_attribute("Class", protagonist.techs); 
    System.out.println("Protagonist: "+protagonist.name);
    System.out.println("Gender: "+protagonist.gender);
    System.out.println("Race: "+protagonist.race);
    System.out.println("Class: "+protagonist.tech); 
      
  }
}
