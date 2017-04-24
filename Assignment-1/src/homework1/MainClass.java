/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework1;

/**
 *
 * @author mhtkarakose
 */
public class MainClass {

      public static void BubbleSort(int [] dizi) 
{ 
    int temp;   // Yer değiştirmede kullanılacak geçici değişken 
    for (int i=1; i<dizi.length; i++) 
    { 
        for(int j=0; j<dizi.length-i; j++) 
        { 
            if (dizi[j] > dizi [j+1]) 
            { 
                temp = dizi [j]; 
                dizi [j] = dizi [j+1]; 
                dizi [j+1] = temp; 
            }//Önce gelen elaman bir sonrakinden büyükse ikisi yer değiştiriyor 
        }// Dizinin ardışık elamanlarını karşılaştırmak için kullandığımız döngü 
    }// Her karşılaştırmadan sonra yeniden kaldığımız yerden devam etmemizi sağlayan döngü 
} 
    
   public static int[] doSelectionSort(int[] arr){ 
          
        for (int i = 0; i < arr.length - 1; i++) 
        { 
            int index = i; 
            for (int j = i + 1; j < arr.length; j++) 
                if (arr[j] < arr[index]) 
                    index = j; 
       
            int smallerNumber = arr[index];  
            arr[index] = arr[i]; 
            arr[i] = smallerNumber; 
        } 
        return arr; 
    } 
   public static void InsertionSort(int[] a){ 
       for (int i=0; i<a.length;i++){ 
           int temp = a[i]; 
           int j; 
           for(j=i-1; j>=0 && temp<a[j];j--){ 
               a[j+1] = a[j]; 
                
           } 
           a[j+1] = temp; 
       } 
   } 
   public static long durationBubbleSort(int[] a){ 
        
       long startTime = System.nanoTime(); 
        BubbleSort(a); 
        long endTime = System.nanoTime(); 
         
        long duration = (endTime - startTime); 
        //System.out.println(duration+ " duration"); 
        return duration; 
   } 
   public static long durationdoSelectionSort(int[] a){ 
        
       long startTime = System.nanoTime(); 
        BubbleSort(a); 
        long endTime = System.nanoTime(); 
         
        long duration = (endTime - startTime); 
        //System.out.println(duration+ " duration"); 
        return duration; 
   } 
   public static long durationInsertionSort(int[] a){ 
        
       long startTime = System.nanoTime(); 
        BubbleSort(a); 
        long endTime = System.nanoTime(); 
         
        long duration = (endTime - startTime); 
        //System.out.println(duration+ " duration"); 
        return duration; 
   } 
 
    /** 
     * @param args the command line arguments 
     */ 
    public static void main(String[] args) { 
        // TODO code application logic here 
         
        int[] dizi = new int[1000]; // n=1000 
        int[] dizi2 = new int[10000]; // n=10000 
        int[] dizi3 = new int[200000]; // n=200000 
         
        for (int i = 0; i < dizi.length; i++) { 
            dizi[i] = (int) (Math.random() * 100);      
        }// end for 
         
        System.out.println("n=1000 Bubble Sort :"+durationBubbleSort(dizi)); 
        System.out.println("n=1000 Selection Sort :"+durationdoSelectionSort(dizi)); 
        System.out.println("n=1000 Insertion Sort :"+durationInsertionSort(dizi)); 
         
        for (int i = 0; i < dizi2.length; i++) { 
            dizi2[i] = (int) (Math.random() * 100);      
        }// end for 
         
        System.out.println("n=10000 Bubble Sort :"+durationBubbleSort(dizi2)); 
        System.out.println("n=10000 Selection Sort :"+durationdoSelectionSort(dizi2)); 
        System.out.println("n=10000 Insertion Sort :"+durationInsertionSort(dizi2)); 
         
        for (int i = 0; i < dizi3.length; i++) { 
            dizi3[i] = (int) (Math.random() * 100);      
        }// end for 
         
        System.out.println("n=200000 Bubble Sort :"+durationBubbleSort(dizi3)); 
        System.out.println("n=200000 Selection Sort :"+durationdoSelectionSort(dizi3)); 
        System.out.println("n=200000 Insertion Sort :"+durationInsertionSort(dizi3)); 
    } 
} 
