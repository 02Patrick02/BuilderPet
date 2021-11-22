/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nu.te4.builderfrankenpet;

import java.util.Scanner;

/**
 *
 * @author kulev
 */
public class Run {
    public Run(){
        
    }
      public static void main(String[] args) {
           Scanner scan = new Scanner(System.in);
           String species = "";
           String name = "";
           String sex = "";
           int legs = 0;
           int heads = 0;
           int tails = 0;
                  
            
           System.out.println("Welcome to Dr Frankenstein's kennel and workshop!");
           while(!species.equalsIgnoreCase("dog")|| !species.equalsIgnoreCase("cat")){  
                System.out.println("What kind of pet would you like? (dog/cat)");
                species = scan.nextLine();
                
                System.out.println("A wise choice! What will their name be?\n"); 
                name = scan.nextLine();
                
                System.out.println("That's a good name! Would you like a male or female " + species + "?\n"); 
                sex = scan.nextLine();

                System.out.println("That makes sense. How many legs would you like it to have?"); 
                legs = scan.nextInt();
                
                System.out.println("A bold decision! How many tails?"); 
                tails = scan.nextInt();
                
                System.out.println("Oooh, I like that! How many heads?"); 
                heads = scan.nextInt();
                
                System.out.println("Well, that's a bit unorthodox. Any way, here's your " + species + ". Enjoy!");
                break;
           }
           
        Pet pet = new PetBuilder()
                .name(name)
                .heads(heads)
                .tails(tails)
                .sex(sex)
                .legs(legs)
                .species(species)
                .build();

                pet.present();
      }
}
