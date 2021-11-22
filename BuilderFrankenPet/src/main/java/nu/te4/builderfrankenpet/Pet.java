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
public abstract class Pet {
    protected int legs;
    protected int heads;
    protected int tails;
    protected String name;
    protected String sex;
    protected String species;
    

    public Pet(PetBuilder petBuilder){
        this.legs = petBuilder.getLegs();
        this.heads = petBuilder.getHeads();
        this.tails = petBuilder.getTails();
        this.name = petBuilder.getName();
        this.sex = petBuilder.getSex();
        this.species = petBuilder.getSpecies();
        
    }
    
    public int getLegs(){
        return legs;
    }
    public void setLegs(int legs){
        this.legs = legs;
    }
    
    public int getHeads(){
        return heads;
    }
    public void setHeads(int heads){
        this.heads = heads;
    }
    
    public int getTails(){
        return tails;
    }
    public void setTails( int tails){
        this.tails = tails;
    }
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    
    public String getSex(){
        return sex;
    }
    public void setSec(String sex){
        this.sex = sex;
    }
    
    public void present(){
        this.speakUp();
        System.out.println();
        System.out.println("My name is " + name + " And I am a " + species);
        System.out.println("I have " + heads + " heads and " + Integer.toString(legs) + " legs.");
        System.out.println("Also I have " + Integer.toString(tails) + " tails and I am a" + sex);
        System.out.println("My life is a mess");
    }
    
    public abstract void speakUp();
        
    
    
    
}
