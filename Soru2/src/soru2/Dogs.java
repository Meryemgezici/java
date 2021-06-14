/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soru2;

/**
 *
 * @author HP Omen
 */
public class Dogs {
      String name;
    String color;
    int age;
    
    public Dogs(){
        name="";
        color="";
        age=9;
    }
    
    public Dogs(String name,String color,int age){
        this.name=name;
        this.color=color;
        this.age=age;
    }
    
    public static void speak(){
        System.out.println("haw haw");
    }
}
