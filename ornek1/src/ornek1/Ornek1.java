/*bu program verilen stringi ters çevirir.
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ornek1;

/**
 *
 * @author HP Omen
 */
 
public class Ornek1 {

    public static String yerDegis(String sentence){
        String temp="";
        for(int i=sentence.length()-1; i>=0; --i){//en son karakterin yerini aldık.ve sondan basa dogu gider
            temp=temp+sentence.charAt(i);//bos olan stringimize verilen stringin son karakterinden baslayarak karakterleri sırasıyla koyduk.
        }
     
        return temp;
    }
    
    public static String yerDegis2(String sentence2){
        String temp="";
        for(int i=sentence2.length()-1; i>=0; --i){
            char temp1=sentence2.charAt(i);
            temp=temp+String.valueOf(temp1);
        }
        return temp;
    }
    public static void main(String[] args) {
       
   String ilk1="meryem gezici";
      System.out.println("ilk1:"+ilk1);
      System.out.println(ilk1.length());
      String temp1="";
      
      for(int i=ilk1.length()-1; i>=0; --i){
          temp1=temp1+ilk1.charAt(i);
      }
      System.out.println("ters cevirilmis hali:"+temp1);
     
   
      System.out.println(yerDegis("meryem gezici"));
      System.out.println(yerDegis2("meryem gezici"));
    }
    
}
