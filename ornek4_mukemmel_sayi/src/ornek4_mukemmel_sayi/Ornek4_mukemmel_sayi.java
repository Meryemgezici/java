/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ornek4_mukemmel_sayi;

import java.util.Scanner;

/**
 *
 * @author HP Omen
 */
public class Ornek4_mukemmel_sayi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        int sum=0;
        
        for(int i=1; i<number; ++i){
            if(number%i==0){
                sum+=i;
            }
        }
        if(number==sum){
            System.out.println("number is perfect number khhghjhhj");
        }
        else{
            System.out.println("this not a perfect number");
        }
    }
    
}
