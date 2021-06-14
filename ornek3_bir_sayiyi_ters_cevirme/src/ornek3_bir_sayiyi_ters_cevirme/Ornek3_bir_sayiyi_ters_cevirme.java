/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ornek3_bir_sayiyi_ters_cevirme;

/**
 *
 * @author HP Omen
 */
public class Ornek3_bir_sayiyi_ters_cevirme {

    /**
     * @param x
     * @param args the command line arguments
     * @return 
     */
    
      public static int ters_cevirme(int x){
            int ters=0;
            for(; x!=0; x/=10){
                int kalan=(int) (x%10);
                ters=ters*10+kalan;
            }
           
          return ters;
      }
    public static void main(String[] args) {
        // TODO code application logic here
         int sayi = 1234, tersi = 0;//oncelikle ters cevireceğimiz sayi ve onu atayacagımız bir değiken olusturduk.
        int yedek=sayi;//bastaki sayiyi tekrardan görmek için bir yedek sayı oluşturduk.
 
        for(;sayi != 0; sayi /= 10) {//bu dongude sayı basta 1234 olarak çalısıyor daha sonra dordü basa aldıktan sanra bu sayıyı 10 bölüp yeni sayımızı oluşturuyoruz.123
            int basamak = sayi % 10;//sayımızdan kalanı buluyoruz 4
            tersi = tersi * 10 + basamak;//bos ters olana atıyoruz daha sonraki gelen kalan için 10 ile çarpmamız gerekir.
        }
        System.out.println("Sayının      : " + yedek);
        System.out.println("Sayının Tersi: " + tersi);
       System.out.println(ters_cevirme(1234));
    }
    
}
