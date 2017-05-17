/* 
 * Character Creation Class for Enemies for RPG
 */
 
// Imports
import java.util.Random;

public class Enemy {
  public static void main (String args[]) {
    class Create_Character {
      //Initialize All the Variables
      String name, gender, race, tech, attr, weapon; 
      String genders[] = {"Male","Female"};
      String races[] = {"Human","Asari","Krogan","Salarian","Collector","Geth","Drone"};
      String techs[] = {"Heavy","Medium","Light"}; 
      
      String generate_name(String race) {
        name = "Enemy "+race;
        return name; 
        }
      
      String choose_attribute(String lists[]) {
        Random randomizer = new Random(); 
        int index = randomizer.nextInt(lists.length); 
        attr = lists[index]; 
        return attr; 
        }
      
      String weapon_specialization (String techs[], String tech) {
        int specialty = -1; 
        for (int i; i < techs.length; i++) {
          if (techs[i].equals(tech)) {
            specialty = i; 
            break; 
            }
          }
          
          switch(specialty) {
          case 0: 
            weapon = "Shotgun"; 
            break; 
          case 1: 
            weapon = "Assault Rifle"; 
            break; 
          case 2: 
            weapon = "SMG"; 
            break; 
          default: 
            System.out.println("Failed to get weapon specialization"); 
          }
          return weapon; 
        }
        
        void print_sheet() {
          System.out.println("########## ME Enemy Sheet ##########"); 
          System.out.println("Name: "+name); 
          System.out.println("Gender: "+gender); 
          System.out.println("Race: "+race); 
          System.out.println("Class: "+tech); 
          System.out.println("Weapon: "+weapon); 
          System.out.println("\n"); 
          return; 
        }
      }
      
      Create_Character enemy = new Create_Character(); 
      enemy.race = enemy.choose_attribute(enemy.races); 
      enemy.name = enemy.generate_name(enemy.race); 
      if (enemy.race != "Geth" & enemy.race != "Drone") {
        enemy.gender = enemy.choose_attribute(enemy.genders); 
      } else enemy.gender = "None"; 
      enemy tech = enemy.choose_attribute(enemy.techs); 
      enemy.weapon = enemy.weapon_specialization(enemy.techs, enemy.tech); 
      enemy.print_sheet(); 
    }
  }
