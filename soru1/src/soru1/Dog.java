/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soru1;

/**
 *
 * @author HP Omen
 */
public class Dog {
    
    String name;
    String color;
    int age;
    
    public Dog(){
        name="";
        color="";
        age=9;
    }
    
    public Dog(String name,String color,int age){
        this.name=name;
        this.color=color;
        this.age=age;
    }
    
    public static void speak(){
        System.out.println("haw haw");
    }
    
 
}
