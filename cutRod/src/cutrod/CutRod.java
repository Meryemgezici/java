/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cutrod;

/**
 *
 * @author HP Omen
 */
public class CutRod {
    static int cutRodp(int price[], int n)
    {
        if (n <= 0)
            return 0;
        int max_val = Integer.MIN_VALUE;
 
        // Recursively cut the rod in different pieces and
        // compare different configurations
        for (int i = 0; i<n; i++){
            max_val = Math.max(max_val,price[i] + cutRodp(price, n-i-1));
         System.out.println("\nMaximum Obtainable Value is:%d   \n "+max_val+"i:"+i);
        }                       
 
        return max_val;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arr[] = new int[] {1, 5, 8, 9, 10, 17, 17, 20};
        int size = arr.length;
        System.out.println("Maximum Obtainable Value is "+
                            cutRodp(arr, size));
    }
    
}
