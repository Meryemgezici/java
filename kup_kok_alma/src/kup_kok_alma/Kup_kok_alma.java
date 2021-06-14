/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kup_kok_alma;

import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author HP Omen
 */
public class Kup_kok_alma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner=new Scanner(System.in);
        double sayi=scanner.nextInt();
        double kok=pow(sayi,(double)1/2);
       
        System.out.println(kok);
    }
    
}
