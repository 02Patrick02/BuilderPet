/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nu.te4.builderfrankenpet;

/**
 *
 * @author kulev
 */
public class Cat extends Pet{
    
    public Cat(PetBuilder builder){
        super(builder);
    }
    
    public void speakUp(){
         System.out.println("hello!!!!!!!!!!");
    } 
}
