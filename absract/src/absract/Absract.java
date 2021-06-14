/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package absract;

/**
 *
 * @author HP Omen
 */
public class Absract {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Game game=new ManGame();//Game game=new Game(); diyemiyoruz abstract sınıflar newlenemez
        game.hesapla();
    }
    
}
