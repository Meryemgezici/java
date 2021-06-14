/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package denemev1;

import static javafx.scene.input.KeyCode.T;

/**
 *
 * @author HP Omen
 */
public interface Deneme1inter<T> extends Iterable<T> {
    /**kuruktaki toplam eleman sayisi*/
	int size();
	boolean isEmpty();
	/**kuyrugun sonuna item ekler*/
	boolean enqueue(T item);
	
	/** kuyrugun basindan eleman cikarir*/
	T dequeuNext();
	/** tekerleme metnini kullanarak bir sonraki elemani secer*/
	T dequeuWithCounting(String tekerleme);
}
