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
           String species = "dog";
           String name;
           String sex;
           int legs;
           int heads;
           int tails;
                  
            
           System.out.println("Welcome to Dr Frankenstein's kennel and workshop!");
           while(species == "dog" || species == "cat"){  
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
           }
           
        Pet dog = new PetBuilder()
                .name("P")
                .heads(2)
                .tails(3)
                .sex("male")
                .legs(4)
                .build();
        
        Pet cat = new PetBuilder()
                .name("P")
                .heads(2)
                .tails(3)
                .sex("male")
                .legs(4)
                .build();
         System.out.println(String.format("%s, %s, %s, %s, %s", dog.getName(), dog.getHeads(), dog.getTails(), dog.getSex(), dog.getLegs()));
         System.out.println(String.format("%s, %s, %s, %s, %s", cat.getName(), cat.getHeads(), cat.getTails(), cat.getSex(), cat.getLegs()));
      }
}
