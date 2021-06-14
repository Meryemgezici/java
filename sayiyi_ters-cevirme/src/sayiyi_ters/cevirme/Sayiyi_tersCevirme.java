/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sayiyi_ters.cevirme;

/**
 *
 * @author HP Omen
 */
public class Sayiyi_tersCevirme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String sayi="123456";
        String ters=" ";
        
        for(int i=sayi.length()-1; i>=0; --i){
            ters+=sayi.charAt(i);
        }
            
               System.out.println("ters:"+ters+"\n"+ters);
           
    }
    
}
