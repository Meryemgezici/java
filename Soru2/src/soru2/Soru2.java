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
public class Soru2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Dogs dog1=new Dogs("yogi","purple",2);
         Dogs dog2=new Dogs("sid","black",3);
        //dog1.speak();
        //System.out.println(dog1.age);
        int i=0;
       while(i<1){//köpeklerin devamlı havlaması için sonsuz dongü 
             System.out.println(dog1.name+";");
             dog1.speak();
             System.out.println(dog2.name+";");
              dog2.speak();
            
        }
     /*   for(int j=1; j>0; j++ ){
            
             System.out.println(dog1.name+";");
             dog1.speak();
             System.out.println(dog2.name+";");
              dog2.speak();
        }*/
    }
    
}
