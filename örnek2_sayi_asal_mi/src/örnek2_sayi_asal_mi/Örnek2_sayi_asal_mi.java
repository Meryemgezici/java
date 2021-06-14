/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Bu kodda kullanıcan alınan herhangi bir sayinin asal olup olmadığını kontrol ettik.
 */
package örnek2_sayi_asal_mi;

import java.util.Scanner;

/**
 *
 * @author HP Omen
 */
public class Örnek2_sayi_asal_mi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        boolean isPrime=true;//basta verilen sayiyi asl olarak kabul ettik.
        
        for(int i=2; i<number; i++){
            if(number%i==0){//eger sayi kendisi ve 1 hariç bir sayıya bolunuyorsa sayiyi asal değil dedik.
                isPrime=false;
            }
           
        }
        
        if(isPrime){//eger isPrime doğru ise asaldir doğru  değilse asal değildir işlemlerini yaptık
            System.out.println("number is prime");
        }
        else{
            System.out.println("number is not prime");
        }
         
                
               
    }
    
}
