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
public class Dog{
    private int legs;
    private int heads;
    private int tails;
    private String name;
    private String sex;
    private String species;
    
    public Dog(int legs, int heads, int tails, String name, String sex, String species) {
       this.legs = legs;
       this.heads = heads;
       this.tails = tails;
       this.name = name;
       this.sex = sex;
       this.species = species;
    }
    
    public Dog(PetBuilder builder){
        this.legs = builder.getLegs();
        this.heads = builder.getHeads();
        this.tails = builder.getHeads();
        this.name = builder.getName();
        this.sex = builder.getSex();
        this.species = builder.getSpecies();
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
    
    public void speakUp(){
        System.out.println("hello!!!!!!!!!!");
    } 
}
