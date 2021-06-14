/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package denemev1;

import java.util.Iterator;
import java.util.Random;

/**
 *
 * @author HP Omen
 */
public class Denemev1<Deneme1> implements Deneme1inter<Deneme1> {

    /**
     * @param args the command line arguments
     */
     Node root;
     int lenght=0; 
    Denemev1(){
        root=null;
    }

 
    class Node{
        Deneme1 data;
        Node next;
      
       Node(Deneme1 data){
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
	public Denemev1(int numberOfCustomer) {
		
	}

	/**
	 *  numberOfCustumer ile verilen sayida  
	 * musteri hizmet gorene kadar calismaya devam eder, 
	 * calisirken verilen tekerlemeyi kullanir*/
	public Denemev1(int numberOfCustomer, String tekerleme) {
		
	}
	/** kuyrugun basindaki musteriyi yada tekerleme 
	 * ile buldugu musteriyi return eder*/
	public Deneme1 chooseCustomer() {
		return null;
		
	}

    @Override
    public int size() {
       return lenght;
    }

    @Override
    public boolean isEmpty() {
        return root==null;

    }

    @Override
    public boolean enqueue(Deneme1 item) {
         if(isEmpty()){
            root=new Node(item);
        }else{
            Node tmp=root;
            while(tmp.next!=null){
                tmp=tmp.next;
                tmp.next= new Node(item);
            }
        }
         lenght++;
        return false;
    }

    @Override
    public Deneme1 dequeuNext() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Deneme1 dequeuWithCounting(String tekerleme) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iterator<Deneme1> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
	 void print(){
        Node tmp=root;
        while(tmp !=null){
        System.out.println(tmp.data+" ");
        tmp=tmp.next;
    }
    }

   

  public static void main(String[] args) {
		// TODO Auto-generated method stub
         Denemev1 c=new Denemev1();
          System.out.println("bos mu:"+c.isEmpty());
          c.enqueue("m1");
          c.enqueue("m2");
          c.enqueue("m1");
          c.enqueue("m2");
          c.print();
          
          System.out.println("bos mu:"+c.isEmpty());
}
}
