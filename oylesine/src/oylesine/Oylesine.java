/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oylesine;

import java.util.Random;

/**
 *
 * @author HP Omen
 */
public class Oylesine {
 int arrivalTime=0;//musterilerin geliş zamanı için
    int removalTime=0;//musterilerin gidiş zamanı için
    Node root;
    int lenght=0; 
    Oylesine(){
        root=null;
    }

    
    class Node{
         
        String data;
        Node next;
        Node(String data){
            this.data=data;
            next=null;
        }

       

       

    }
	String tekerleme = "O piti piti karamela sepeti "
			+ "\nTerazi lastik jimnastik "
			+ "\nBiz size geldik bitlendik Hamama gittik temizlendik.";
			
	/**
	 *  numberOfCustumer ile verilen sayida  
	 * musteri hizmet gorene kadar calismaya devam eder*/
	public Oylesine(int numberOfCustomer) {
		
	}

	/**
	 *  numberOfCustumer ile verilen sayida  
	 * musteri hizmet gorene kadar calismaya devam eder, 
	 * calisirken verilen tekerlemeyi kullanir*/
	public Oylesine(int numberOfCustomer, String tekerleme) {
		
	}
	/** kuyrugun basindaki musteriyi yada tekerleme 
	 * ile buldugu musteriyi return eder*/
	

    public int size() {
       return lenght;
    }

    public boolean isEmpty() {
       return root==null;
    }

    public boolean enqueue(String item) {
         Random r = new Random();
         int a=r.nextInt(3);
         arrivalTime=arrivalTime+a;//musterilerin gelis zamani
         if(a<3 ){
        if(isEmpty()){
            root=new Node(item);
        }else{
            Node tmp=root;
            while(tmp.next!=null){
                tmp=tmp.next;
                tmp.next= new Node(item);
            }
        }}
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
