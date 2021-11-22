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
public class PetBuilder {
    private int legs;
    private int heads;
    private int tails;
    private String name;
    private String sex;
    private String species;
    
    public PetBuilder legs(int legs){
        this.legs = legs;
        return this;
    }
    
    public PetBuilder heads(int heads){
        this.heads = heads;
        return this;
    }
    public PetBuilder tails(int tails){
        this.tails = tails;
        return this;
    }
    
    public PetBuilder name(String name){
       this.name = name;
       return this;
   }
    
    public PetBuilder sex(String sex){
        this.sex = sex;
        return this;
    }
    public PetBuilder species(String species){
        this.species = species;
        return this;
    }
    
    public int getLegs(){
        return legs;
    }
    
    public int getHeads(){
        return heads;
    }
    
    public int getTails(){
        return tails;
    }
 
    public String getName(){
       return name;
    }
    
    public String getSex(){
        return sex;
    }
    
    public String getSpecies(){
        return species;
    }
    
    public Pet build(){
        if(species.equalsIgnoreCase("dog")){
            return new Dog(this);
        }
        else{
            return new Cat(this);
        }
    }
}
