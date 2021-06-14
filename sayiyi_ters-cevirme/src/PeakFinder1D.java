
import java.util.Random;
import java.util.Arrays;

public class PeakFinder1D {
    public static int[][] a;
    public static int nrow;
    public static int ncol;

    public PeakFinder1D(int nrow, int ncol){
        this.nrow=nrow;
        this.ncol=ncol;
        a = new int[nrow][ncol];
        for(int row = 0 ; row < nrow ; row++){
            for(int col = 0 ; col < ncol ; col++){
                Random r = new Random();
                a[row][col] = r.nextInt(100); 
            }
        }
    }
    public int greedyAlg(){
        int peak = a[0][0];
        for(int row = 0; row< nrow; row++){
           // int sayi=row;
            if (row%2==0){
                for(int col = 0; col < ncol; col++){
                    if(row-1>=0 && col+1<ncol && col-1>=0 && row+1<nrow){
                        if (a[row][col]> a[row-1][col] && a[row][col] > a[row][col+1] && a[row][col] > a[row][col-1] && a[row][col] > a[row+1][col])
                            peak=a[row][col];   
                    }
                    
                }
            }           
            else{
                for(int col = ncol-1; col>=0; col--){
                    if(row-1>=0 && col+1<ncol && col-1>=0 && row+1<nrow){
                        if (a[row][col]> a[row-1][col] && a[row][col] > a[row][col+1] && a[row][col] > a[row][col-1] && a[row][col] > a[row+1][col])
                              peak=a[row][col];
                    }
                    
                }
            }              
        }
        return peak;
    }

  
   /* public int findMax(int[][] b){
        int imax = 0;
        for(int i = 0; i < a.length; i++ ){
            if(a[i]>a[imax]){
                imax = i;
            }
        }
        return imax;
    } y*/
   
    public int findMaxOnCol(int col){
        int imax = 0;
        for(int i = 0; i < nrow; i++ ){
            if(a[i][col]>a[imax][col]){
                imax = i;
            }
        }
        return imax;
    }
    public int regNumOnCol(int col,int max){ // Eğer kolondaki en büyük sayı etrafındaki sayılardan küçükse istenilen diğer büyük sayıları döndürecek fonk.
        int[]arr=new int[nrow];
        int temp=0;
        for(int k=0 ; k<nrow-1 ; k++){
            arr[k]=a[k][col];
        }
        for(int i = 0; i <= nrow-1; i++ ){
            for(int j = i + 1 ; j <= i ; j++){
                if(arr[j] > arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[max-1];    // kaçıncı en büyük sayıyı istiyorsa onu döndürecek
    }
    public int regNumOnRow(int row,int max){ // Eğer satırdaki en büyük sayı etrafındaki sayılardan küçükse istenilen diğer büyük sayıları döndürecek fonk.
        int[]arr=new int[ncol];
        int temp=0;
        for(int k=0 ; k<ncol-1 ; k++){
            arr[k]=a[row][k];
        }
        for(int i = 0; i <= ncol-1; i++ ){
            for(int j = i + 1 ; j <= i ; j++){
                if(arr[j] > arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[max-1];    // kaçıncı en büyük sayıyı istiyorsa onu döndürecek
    }
    
    public int findMaxOnRow(int row){
        int imax = 0;
        for(int i = 0; i < ncol; i++ ){
            if(a[row][i]>a[row][imax]){
                imax = i;
            }
        }
        return imax;
    }
    public int divideAndConquer1(int startcol, int endcol){
        int max=1;
        //TODO correct and complete the code
        int midcol = (startcol + endcol)/2; //1 tane
        int imax = findMaxOnCol(midcol); // number of rows: m
        ///base case TODO: boundary conditions
        if(a[imax][midcol] >= a[imax][midcol+1] && a[imax][midcol] >= a[imax][midcol-1]  ) //2 tane
            return a[imax][midcol];
        if(a[imax][midcol] >= a[imax][midcol+1] )
            return divideAndConquer1(startcol, midcol);     
        if(a[imax][midcol] >= a[imax][midcol-1]  )
            return  divideAndConquer1(midcol, endcol);
        if(a[imax][midcol] < a[imax][midcol-1] && a[imax][midcol] < a[imax][midcol+1] ){ 
            max++; //kolondaki max sayı etrafındaklerden küçükse bir küçük max sayıyı döndürücek
            return regNumOnCol(midcol,max);
        }
        else
            return a[imax][midcol];
    }

    /** derste anlatilan divide and conquer  yontemini kullanarak O(n+m)
     *  zamanda peak bulan algoritmanin implemantasyonunu yaziniz*/
    public int divideAndConquer2(int startrow, int startcol, int endrow, int endcol){
        //TODO
        int flag=0;
        while(flag==0){
            if(nrow>ncol){
                int max=1;
                int midrow = (startrow + endrow)/2;
                int imax = findMaxOnRow(midrow);
                if(a[midrow][imax] >= a[midrow+1][imax] && a[midrow][imax] >= a[midrow-1][imax]  ) //2 tane
                    return a[midrow][imax];
                    flag=1;
                if(a[midrow][imax] >= a[midrow+1][imax] )
                    return divideAndConquer2(startrow, startcol, midrow,endcol);    
                if(a[midrow][imax] >= a[midrow-1][imax]  )
                    return  divideAndConquer2(midrow,startcol,endrow, endcol);
                if(a[midrow][imax] < a[midrow-1][imax] && a[midrow][imax] < a[midrow+1][imax] ){ 
                    max++; //satırdaki max sayı etrafındaklerden küçükse bir küçük max sayıyı döndürücek
                    return regNumOnRow(midrow,max);
            }
            
            }
            if(nrow<ncol){
                int max=1;
                //TODO correct and complete the code
                int midcol = (startcol + endcol)/2; //1 tane
                int imax = findMaxOnCol(midcol); // number of rows: m
                ///base case TODO: boundary conditions
                if(a[imax][midcol] >= a[imax][midcol+1] && a[imax][midcol] >= a[imax][midcol-1]  ) //2 tane
                    return a[imax][midcol];
                flag=1;
                if(a[imax][midcol] >= a[imax][midcol+1] )
                    return divideAndConquer2(startrow, startcol,endrow, midcol);     
                if(a[imax][midcol] >= a[imax][midcol-1]  )
                    return  divideAndConquer2(startrow, midcol,endrow, endcol);
                if(a[imax][midcol] < a[imax][midcol-1] && a[imax][midcol] < a[imax][midcol+1] ){ 
                    max++; //kolondaki max sayı etrafındaklerden küçükse bir küçük max sayıyı döndürücek
                    return regNumOnCol(midcol,max);
                }
            }

        }
    return 0;
    }

    /** prints elements of a */
    static void printArray(){
        //TODO
        for(int i=0 ; i<ncol ; i++){
            for(int j=0; j<nrow; j++){
                System.out.print(a[i][j]+"    ");
            }
            System.out.println(""); 
        }
    }
    static void testGreedyAlg(){
        //TODO
        PeakFinder1D peak= new PeakFinder1D(4,4);
        peak.greedyAlg();
        System.out.println( "Greedy algoritması sonucu peak: "+peak.greedyAlg());
    }
    static void testDivideAndConq1(){
        //TODO
        PeakFinder1D peak= new PeakFinder1D(4,4);
        peak.divideAndConquer1(0, nrow-1);
        System.out.println( "Divide And Conquer1 algoritması sonucu peak: "+ peak.divideAndConquer1(0, nrow-1));
    }
    static void testDivideAndConq2(){
        //TODO
        PeakFinder1D peak= new PeakFinder1D(4,4);
        peak.divideAndConquer2(0,0,nrow-1,ncol-1);
        System.out.println( "Divide And Conquer2 algoritması sonucu peak: "+ peak.divideAndConquer2(0,0,nrow-1,ncol-1));
    }      

    public static void main(String[] args){
        printArray();
        testGreedyAlg();
        testDivideAndConq1();
        testDivideAndConq2();
    }
}